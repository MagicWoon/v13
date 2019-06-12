package com.wh.v13.common.base.impl;

import com.wh.v13.common.base.IBaseDao;
import com.wh.v13.common.base.IBaseService;

import java.util.List;

/**
 * User: Magic Woo
 * Date: 2019/6/11
 * Time: 23:55
 * version 1.0
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {
    public  abstract IBaseDao<T> getBaseDao();
    public int deleteByPrimaryKey(Long id) {
        return getBaseDao().deleteByPrimaryKey(id);
    }

    public int insert(T record) {
        return getBaseDao().insert(record);
    }

    public int insertSelective(T record) {
        return getBaseDao().insertSelective(record);
    }

    public T selectByPrimaryKey(Long id) {
        return getBaseDao().selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(T record) {
        return getBaseDao().updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKeyWithBLOBs(T record) {
        return getBaseDao().updateByPrimaryKeyWithBLOBs(record);
    }

    public int updateByPrimaryKey(T record) {
        return getBaseDao().updateByPrimaryKey(record);
    }

    public List<T> getList() {
        return getBaseDao().getList();
    }
}
