package cn.ljl.demo.controller;

import cn.ljl.demo.domain.Product;
import cn.ljl.demo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
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

    @GetMapping(value = "/login")
    public String login(Model model) {
        model.addAttribute("name", "陈凌浩你是逗逼吗");
        return "login";
    }
}
