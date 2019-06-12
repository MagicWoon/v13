package com.wh.v13.common.base;

import java.util.List;

/**
 * User: Magic Woo
 * Date: 2019/6/11
 * Time: 13:20
 * version 1.0
 */
public interface IBaseDao<T> {
    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKeyWithBLOBs(T record);

    int updateByPrimaryKey(T record);

    public List<T> getList();
}
