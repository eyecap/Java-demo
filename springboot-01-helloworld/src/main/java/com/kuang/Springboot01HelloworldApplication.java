package com.kuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication:标注这个类是一个Springboot的应用:启动类下的所有资源被导入
@SpringBootApplication
public class Springboot01HelloworldApplication {

    public static void main(String[] args) {
        //将springboot的应用启动
        //SpringApplication类
        //run方法

        SpringApplication.run(Springboot01HelloworldApplication.class, args);
    }

}
