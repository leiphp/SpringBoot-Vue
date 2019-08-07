package cn.lxtkj.controller;

import cn.lxtkj.dao.UserDao;
//import User;
import cn.lxtkj.entity.User;
import cn.lxtkj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;
    @RequestMapping("/createUser")
    public String createUser(String name, Integer age){
        userService.createUser(name, age);
        return "success";
    }
    @RequestMapping("/getUser")
    public User getUser(Integer id){
        return userDao.findById(id).get();

    }
    //下面是走Map保存
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserController(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }
//    @PostMapping("/person/save")
//    public User save(@RequestParam  String name){
//        User user = new User();
//        user.setName(name);
//        if(userRepository.save(user)){
//            System.out.printf("用户对象：%s保存成功",user);
//        }
//        return user;
//    }
}
