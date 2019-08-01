package cn.lxtkj.firstappdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/indexController")
    public String indexController(){
        return "indexController";
    }
}
