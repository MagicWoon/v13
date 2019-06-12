package com.wh.v13centerweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.wh.v13.api.IProductService;
import com.wh.v13.entity.TProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: Magic Woo
 * Date: 2019/6/11
 * Time: 20:00
 * version 1.0
 */

@Controller
@RequestMapping("product")
public class ProductController {

    @Reference
    private IProductService productService;

    @RequestMapping("get/{id}")
    @ResponseBody
    public TProduct getById(@PathVariable Long id){
        return productService.selectByPrimaryKey(id);
    }

    @RequestMapping("list")
    public String getList(Model model){
        List<TProduct> list = productService.getList();
        model.addAttribute("list",list);
        return "product/list";
    }

    @RequestMapping("page/{index}/{size}")
    public String getList(@PathVariable Integer index,@PathVariable Integer size, Model model){
        PageInfo<TProduct> page = productService.page(index, size);
        model.addAttribute("page",page);
        return "product/list";
    }

}
