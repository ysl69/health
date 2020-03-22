package com.itheima.health.dao;

import com.itheima.health.pojo.Role;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @Author ysl
 * @Date 2020/3/21 21:52
 * @Description:
 **/
@Repository
public interface RoleDao {

    Set<Role> findRolesByUserId(Integer userId);
}
