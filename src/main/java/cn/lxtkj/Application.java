package cn.lxtkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages = {"cn.lxtkj.controller","cn.lxtkj.service"})
@ComponentScan("cn.lxtkj")
@EnableJpaRepositories("cn.lxtkj.dao")
@EnableAutoConfiguration
@EntityScan("cn.lxtkj.entity")
//@EnableScheduling//自动执行
//标识该接口全部返还json格式
public class Application {
    public static void main(String[] args){
        //主函数运行Springboot项目
        SpringApplication.run(Application.class, args);
    }
}
