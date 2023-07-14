package com.kuang.service;

import org.springframework.stereotype.Component;

//zookeeper:服务注册与实现
@Component //使用了Dubbo后尽量不要用Service注解
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "狂神说间";
    }
}
