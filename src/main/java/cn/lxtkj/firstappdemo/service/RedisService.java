package cn.lxtkj.firstappdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void setObject(String key, Object value){
        //redis有几种string list set zset hash
        if(StringUtils.isEmpty(key)||value==null){
            return;
        }
        //判断类型，存放string类型
        if(value instanceof String){
            String strValue=(String) value;
            stringRedisTemplate.opsForValue().set(key,strValue);
        }
    }
}
