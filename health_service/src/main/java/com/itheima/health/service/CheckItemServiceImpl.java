package com.itheima.health.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.health.dao.CheckItemDao;
import com.itheima.health.pojo.CheckItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author ysl
 * @Date 2020/3/11 21:27
 * @Description:
 **/

@Service(interfaceClass = CheckItemService.class)
@Transactional
public class CheckItemServiceImpl implements CheckItemService{

    @Autowired
    private CheckItemDao checkItemDao;

    /**
     * 新增
     * @param checkItem
     */
    @Override
    public void add(CheckItem checkItem) {
            checkItemDao.add(checkItem);
        }
}
