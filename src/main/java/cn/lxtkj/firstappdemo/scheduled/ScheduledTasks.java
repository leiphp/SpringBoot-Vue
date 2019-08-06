package cn.lxtkj.firstappdemo.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    @Scheduled(fixedRate = 10000)
    public void test(){
        System.out.println("我正在每隔10秒打印...");
    }
}
