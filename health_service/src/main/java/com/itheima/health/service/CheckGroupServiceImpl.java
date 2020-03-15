package com.itheima.health.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.health.dao.CheckGroupDao;
import com.itheima.health.pojo.CheckGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ysl
 * @Date 2020/3/15 20:02
 * @Description: 检查组
 **/

@Service(interfaceClass = CheckGroupService.class)
@Transactional
public class CheckGroupServiceImpl implements CheckGroupService{

    @Autowired
    private CheckGroupDao checkGroupDao;


    /**
     * 新增
     * 添加检查组合，同时需要设置检查组合和检查项的关联关系
     * @param checkGroup
     * @param checkitemIds
     */
    @Override
    public void add(CheckGroup checkGroup, Integer[] checkitemIds) {
        checkGroupDao.add(checkGroup);
        setCheckGroupAndCheckItem(checkGroup.getId(),checkitemIds);
    }


    /**
     * 设置检查组合和检查项的关联关系
     * @param checkGroupId
     * @param checkitemIds
     */
    private void setCheckGroupAndCheckItem(Integer checkGroupId, Integer[] checkitemIds) {
        if (checkitemIds != null && checkitemIds.length > 0){
            for (Integer checkitemId : checkitemIds) {
                Map<String, Integer> map = new HashMap<>();
                map.put("checkgroup_id",checkGroupId);
                map.put("checkitem_id",checkitemId);
                checkGroupDao.setCheckGroupAndCheckItem(map);
            }
        }
    }
}
