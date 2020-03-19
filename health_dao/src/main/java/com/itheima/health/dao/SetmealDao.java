package com.itheima.health.dao;

import com.github.pagehelper.Page;
import com.itheima.health.pojo.CheckItem;
import com.itheima.health.pojo.Setmeal;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author ysl
 * @Date 2020/3/16 20:44
 * @Description:
 **/

@Repository
public interface SetmealDao {

    /**
     * 新增
     * @param setmeal
     */
    void add(Setmeal setmeal);

    /**
     * 绑定套餐和检查组的多对多关系
     * @param map
     */
    void setSetmealAndCheckGroup(Map<String, Integer> map);


    /**
     * 分页查询
      * @param queryString
     * @return
     */
    Page<CheckItem> selectByCondition(String queryString);


    /**
     * 查询所有套餐信息
     * @return
     */
    List<Setmeal> findAll();


    /**
     * 根据id查询套餐信息
     * @param id
     * @return
     */
    Setmeal findById(int id);
}
