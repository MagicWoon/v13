package com.wh.v13productservice;

import com.github.pagehelper.PageInfo;
import com.wh.v13.api.IProductService;
import com.wh.v13.entity.TProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class V13ProductServiceApplicationTests {

    @Autowired
    private IProductService productService;

    @Test
    public void contextLoads() {
        List<TProduct> list = productService.getList();
        System.out.println(list.size());
    }

    @Test
    public void getPage() {
        PageInfo<TProduct> page = productService.page(2, 5);
        System.out.println(page.getList().size());
    }

}
