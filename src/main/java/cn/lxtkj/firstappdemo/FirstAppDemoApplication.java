package cn.lxtkj.firstappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@SpringBootApplication
public class FirstAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppDemoApplication.class, args);
	}
	@RequestMapping("/")
	String index(){
		//输出系统当前时间
		return "Hello World"+new SimpleDateFormat().format(new Date());
	}

}
