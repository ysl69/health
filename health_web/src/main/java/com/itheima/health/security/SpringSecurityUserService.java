package com.itheima.health.security;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.health.pojo.Permission;
import com.itheima.health.pojo.Role;
import com.itheima.health.service.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author ysl
 * @Date 2020/3/21 20:38
 * @Description:
 **/

@Component
public class SpringSecurityUserService implements UserDetailsService {


    @Reference
    private UserService userService;



    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //远程调用用户服务，根据用户名查询用户信息
        com.itheima.health.pojo.User user = userService.findUSerByUsername(username);
        if (user == null){
            //用户名不存在，抛出异常UsernameNotFoundException
            return null;
        }
        //授权
        List<GrantedAuthority> list = new ArrayList<>();
        if (user != null && user.getRoles() != null && user.getRoles().size() > 0){
            Set<Role> roles = user.getRoles();
            for (Role role : roles) {
                if (role!=null && role.getPermissions()!=null && role.getPermissions().size()>0){
                    Set<Permission> permissions = role.getPermissions();
                    for (Permission permission : permissions) {
                        String keyword = permission.getKeyword();
                        //授权
                        list.add(new SimpleGrantedAuthority(keyword));
                    }
                }
            }
        }

            /**
             * User()
             * 1：指定用户名
             * 2：指定密码（SpringSecurity会自动对密码进行校验）
             * 3：传递授予的角色和权限
             */
            User userDetails = new User(username, user.getPassword(), list);
            return userDetails;
        }
}
