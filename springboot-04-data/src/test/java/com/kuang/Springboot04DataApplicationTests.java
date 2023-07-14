package com.kuang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springboot04DataApplicationTests {

//    数据库
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() throws SQLException {
//        查看一下默认的数据源：com.zaxxer.hikari.HikariDataSource dbcp
        System.out.println(dataSource.getClass());

        //获得数据库链接
        Connection connection=dataSource.getConnection();
        System.out.println(connection);

//        xxx Template: Springboot 已经配置好模板bean,拿来即用 CRUD


        //关闭
        connection.close();

    }


}
