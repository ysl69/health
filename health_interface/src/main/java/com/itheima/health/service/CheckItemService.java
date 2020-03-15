package com.itheima.health.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.health.entity.PageResult;
import com.itheima.health.pojo.CheckItem;

import java.util.List;

/**
 * @Author ysl
 * @Date 2020/3/11 21:25
 * @Description:
 **/

@Service
public interface CheckItemService {
    /**
     * 检查项服务接口
     * @param checkItem
     */
    void add(CheckItem checkItem);


    /**
     * 分页
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);


    /**
     * 删除检查项
     * @param id
     */
    void delete(Integer id);


    /**
     * 跳转到检查项编辑页面  主键查询
     * @param id
     * @return
     */
    CheckItem findById(Integer id);


    /**
     * 编辑保存
     * @param checkItem
     */
    void edit(CheckItem checkItem);


    /**
     * 查询所有
     * @return
     */
    List<CheckItem> findAll();

}
