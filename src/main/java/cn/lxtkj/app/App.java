package cn.lxtkj.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages = {"cn.lxtkj.firstappdemo.controller","cn.lxtkj.firstappdemo.service"})
@ComponentScan("cn.lxtkj.firstappdemo")
@EnableJpaRepositories("cn.lxtkj.firstappdemo.dao")
@EnableAutoConfiguration
@EntityScan("cn.lxtkj.firstappdemo.entity")
//@EnableScheduling//自动执行
//标识该接口全部返还json格式
public class App {
    public static void main(String[] args){
        //主函数运行Springboot项目
        SpringApplication.run(App.class, args);
    }
}
