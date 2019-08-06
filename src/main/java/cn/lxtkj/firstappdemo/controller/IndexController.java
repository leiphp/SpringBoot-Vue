package cn.lxtkj.firstappdemo.controller;

import cn.lxtkj.firstappdemo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@RestController//该注解相当于@ResponseBody ＋ @Controller合在一起的作用
@Controller //
public class IndexController {
    @Autowired
    private RedisService redisService;

    @RequestMapping("/indexController")
    public String indexController(Map<String, Object> result){
        System.out.println("IndexController......index");
        result.put("name","leixiaotian");
        result.put("sex",1);
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        result.put("userlist", list);
        return "index";
    }

    @RequestMapping("/setString")
    @ResponseBody
    public String setString(String key, String value){
        redisService.setString(key, value);
        return "setString success";
    }

    @RequestMapping("/setList")
    public String setList(String key){
        List<String> listString = new ArrayList<>();
        listString.add("123");
        listString.add("456");
        redisService.setList(key, listString);
        return "setList success";
    }
    @RequestMapping("/getKey")
    @ResponseBody
    public String getKey(String key){
        return redisService.getStringKey(key);
    }
}
