package com.vrspring.web.controller;

import com.vrspring.web.bean.HomeBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author xie
 * @Date 17/2/19 上午10:15.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String root(HttpServletRequest request){
        return "index";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        return "index";
    }

    @RequestMapping("/about")
    public String about(HttpServletRequest request){
        return "about";
    }
}
