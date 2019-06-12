package com.wh.v13.common.base;

import java.util.List;

/**
 * User: Magic Woo
 * Date: 2019/6/11
 * Time: 13:19
 * version 1.0
 */
public interface IBaseService<T> {
    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKeyWithBLOBs(T record);

    int updateByPrimaryKey(T record);

    public List<T> getList();
}
