package cn.lxtkj.firstappdemo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("cn.lxtkj.firstappdemo")
@EnableAutoConfiguration
//标识该接口全部返还json格式
public class App {
    public static void main(String[] args){
        //主函数运行Springboot项目
        SpringApplication.run(App.class, args);
    }
}
