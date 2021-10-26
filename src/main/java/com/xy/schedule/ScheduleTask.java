package com.xy.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description: 定时任务
 * @author: JX。Chang
 * @date: 2021年10月19日 21:27
 */
@Component
public class ScheduleTask {

    //* corn在线生成 http://cron.qqe2.com/
    /*
    那就早上8点一个 下午4点一个吧  晚上 9点一个 呢
    0 0 8,16,21 * * ? *
     */

    // 固定间隔时间执行, 方法执行完成后, 按照间隔时间点再次执行该方法
    // 比如方法执行5s, 定时间隔为3s, 则中间有一次执行不上, 从第6s开始下一次执行
    @Scheduled(cron = "0/3 * * * * *")
    public void ScheduleJob() {
        System.out.println("corn       : " + new Date());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
