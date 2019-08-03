package cn.lxtkj.firstappdemo.dao;

import cn.lxtkj.firstappdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
