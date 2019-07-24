package cn.lxtkj.firstappdemo.repository;

import cn.lxtkj.firstappdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * User
 * Respository
 */
@Repository
public class UserRepository {
    /**
     * 采用内存型存储方式 Map
     */
    private final ConcurrentMap<Integer, User> repository = new ConcurrentHashMap<>();

    private final static AtomicInteger idGenerator = new AtomicInteger();
    /**
     * 保存用户对象
     * @param user
     * @return 如果保存成功，返回true
     * 否则，返回false
     */
    public boolean save(User user){
        //ID从1开始
        Integer id = idGenerator.incrementAndGet();
        //设置ID
        user.setId(id);
        return repository.put(id,user)==null;
    }
    /**
     * 返回所有用户列表
     */
    public Collection<User> findAll(){

        return repository.values();
    }
}
