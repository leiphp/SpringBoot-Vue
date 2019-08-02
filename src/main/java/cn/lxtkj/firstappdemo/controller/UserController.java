package cn.lxtkj.firstappdemo.controller;

import cn.lxtkj.firstappdemo.domain.User;
import cn.lxtkj.firstappdemo.repository.UserRepository;
import cn.lxtkj.firstappdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/createUser")
    public String createUser(String name, Integer age){
        userService.createUser(name, age);
        return "success";
    }
    //下面是走Map保存
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @PostMapping("/person/save")
    public User save(@RequestParam  String name){
        User user = new User();
        user.setName(name);
        if(userRepository.save(user)){
            System.out.printf("用户对象：%s保存成功",user);
        }
        return user;
    }
}
