package cn.ljl.demo.controller;

import cn.ljl.demo.domain.Product;
import cn.ljl.demo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private ProductMapper productMapper;

    @GetMapping(value = "/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

    @GetMapping(value = "/testMyBatis")
    public void testMyBatis() {
        Product product = productMapper.selectByPrimaryKey();
        System.out.println(product);
    }
}
