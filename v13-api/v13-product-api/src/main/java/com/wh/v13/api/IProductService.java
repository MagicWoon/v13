package com.wh.v13.api;

import com.github.pagehelper.PageInfo;
import com.wh.v13.common.base.IBaseService;
import com.wh.v13.entity.TProduct;

import java.util.List;

/**
 * User: Magic Woo
 * Date: 2019/6/11
 * Time: 16:06
 * version 1.0
 */
public interface IProductService extends IBaseService<TProduct> {

    //分页
    public PageInfo<TProduct> page(Integer pageIndex, Integer pageSize);

}

