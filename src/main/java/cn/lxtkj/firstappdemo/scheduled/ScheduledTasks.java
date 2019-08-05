package cn.lxtkj.firstappdemo.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    @Scheduled(fixedRate = 1000)
    public void test(){
        System.out.println("我正在每隔1秒打印...");
    }
}
