package com.itheima.health.service;

import com.itheima.health.entity.PageResult;
import com.itheima.health.pojo.CheckGroup;

import java.util.List;

/**
 * @Author ysl
 * @Date 2020/3/15 20:01
 * @Description: 检查组
 **/
public interface CheckGroupService {

    /**
     * 新增
     * @param checkGroup
     * @param checkitemIds
     */
    void add(CheckGroup checkGroup, Integer[] checkitemIds);


    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);


    /**
     * 根据id查询
     * @param id
     * @return
     */
    CheckGroup findById(Integer id);


    /**
     * 根据检查组合id查询对应的所有检查项id
     * @param id
     * @return
     */
    List<Integer> findCheckItemByCheckGroupId(Integer id);


    /**
     * 编辑
     * @param checkGroup
     * @param checkitemIds
     */
    void edit(CheckGroup checkGroup, Integer[] checkitemIds);


}
