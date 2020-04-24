package cn.lxtkj.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@EnableAutoConfiguration
//标识该接口全部返还json格式
@RestController
public class HelloWorldController {

    @RequestMapping("/index")
    public String index(){
        return "success";
    }

    @RequestMapping("/getMap")
    public Map<String, Object> getMap(){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("errorCode","200");
        result.put("errorMsg","成功...");
        return result;
    }
    public static void main(String[] args){
        //主函数运行Springboot项目
        SpringApplication.run(HelloWorldController.class, args);
    }

}
