package com.wh.v13productservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wh.v13.api.IProductService;
import com.wh.v13.common.base.IBaseDao;
import com.wh.v13.common.base.impl.BaseServiceImpl;
import com.wh.v13.entity.TProduct;
import com.wh.v13.mapper.TProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/**
 * User: Magic Woo
 * Date: 2019/6/11
 * Time: 16:14
 * version 1.0
 */
@Service
public class ProductServiceImpl extends BaseServiceImpl<TProduct> implements IProductService {

    @Autowired
    private TProductMapper productMapper;

    @Override
    public IBaseDao<TProduct> getBaseDao() {
        return productMapper;
    }

    @Override
    public List<TProduct> getList() {
        return productMapper.getList();
    }

    @Override
    public PageInfo<TProduct> page(Integer pageIndex, Integer pageSize) {
        //设置分页参数
        PageHelper.startPage(pageIndex,pageSize);
        //获取数据
        List<TProduct> list = getList();
        //构建分页对象
        PageInfo<TProduct> pageInfo = new PageInfo<TProduct>(list);
        return pageInfo;
    }
}
