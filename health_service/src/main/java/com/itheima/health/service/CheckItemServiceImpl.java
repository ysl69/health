package com.itheima.health.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.health.dao.CheckItemDao;
import com.itheima.health.entity.PageResult;
import com.itheima.health.pojo.CheckItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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


    /**
     * 分页
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    @Override
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<CheckItem> page = checkItemDao.selectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }


    /**
     * 删除检查项
     * @param id
     */
    @Override
    public void delete(Integer id) throws RuntimeException{
        //查询当前检查项是否和检查组关联
        long count = checkItemDao.findCountCheckItemId(id);
        if (count>0){
            //当前检查项被引用，不能删除
            throw new RuntimeException("当前检查项被检查组引用，不能删除");
        }
        checkItemDao.deleteById(id);
    }


    /**
     * 跳转到检查项编辑页面  主键查询
     * @param id
     * @return
     */
    @Override
    public CheckItem findById(Integer id) {
        CheckItem checkItem = checkItemDao.findCheckItemId(id);
        return checkItem;
    }


    /**
     * 编辑保存
     * @param checkItem
     */
    @Override
    public void edit(CheckItem checkItem) {
        checkItemDao.edit(checkItem);
    }


    /**
     * 查询所有
     * @return
     */
    @Override
    public List<CheckItem> findAll() {
        return checkItemDao.findAll();
    }
}
