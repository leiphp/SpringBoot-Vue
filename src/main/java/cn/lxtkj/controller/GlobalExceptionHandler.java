package cn.lxtkj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//全局捕获异常类
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> resultError(){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("errorCode","500");
        result.put("errorMsg","系统错误");
        return result;
    }

}
