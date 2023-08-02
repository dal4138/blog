package com.blog.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    // URL/blog
    @RequestMapping("/blog")
    // Body input
    @ResponseBody
    public String index() {
        return "index";
    }
}
