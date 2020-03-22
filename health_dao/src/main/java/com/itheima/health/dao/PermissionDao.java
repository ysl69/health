package com.itheima.health.dao;

import com.itheima.health.pojo.Permission;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @Author ysl
 * @Date 2020/3/21 21:53
 * @Description:
 **/
@Repository
public interface PermissionDao {

    Set<Permission> findPermissionsByRoleId(Integer roleId);
}
