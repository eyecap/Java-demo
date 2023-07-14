package com.kuang.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    //在一个特定的时间执行这个方法~ Timer

    //cron 表达式~
    //秒 分 时 日 月 周几
    // 30 0、5 10，18 * * ？ 每天的10点到18点，每隔五分钟执行一次
    // 0 15 10 ？ * * 1-6 每个月的周一到周六 10点15分执行
    @Scheduled(cron = "30 30 20 * * 0-7")
    public void hello(){
        System.out.println("hello,你被执行了~");
    }
}
