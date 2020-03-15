package com.itheima.health.dao;

import com.github.pagehelper.Page;
import com.itheima.health.pojo.CheckGroup;
import com.itheima.health.pojo.CheckItem;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author ysl
 * @Date 2020/3/15 21:34
 * @Description:
 **/

@Repository
public interface CheckGroupDao {

    /**
     * 新增
     * @param checkGroup
     */
    void add(CheckGroup checkGroup);


    /**
     * 设置检查组合和检查项的关联关系
     * @param map
     */
    void setCheckGroupAndCheckItem(Map<String, Integer> map);


    /**
     * 分页查询
     * @param queryString
     * @return
     */
    Page<CheckItem> selectByCondition(String queryString);


    /**
     * 据检查组id删除中间表数据（清理原有关联关系）
     * @param id
     */
    void deleteAssociation(Integer id);


    /**
     * 更新检查组基本信息
     * @param checkGroup
     */
    void edit(CheckGroup checkGroup);


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

}
