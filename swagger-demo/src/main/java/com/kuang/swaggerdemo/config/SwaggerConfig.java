package com.kuang.swaggerdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2//开启Swagger2
public class SwaggerConfig {


    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }

    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("C");
    }



    //enable是否启动Swagger,如果为False,则不启动swagger
    @Bean
    public Docket docket(Environment environment){

        //设置要显示的Swagger环境
        Profiles profiles=Profiles.of("dev","test");
        //获取项目的环境：通过下面方法，判断是否处在自己设定的环境当中
        boolean flag = environment.acceptsProfiles(profiles);


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("狂神")
                .enable(flag)
                .select()
                //withClassAnnotation:扫描类上的注解
                //none():不扫描
                //any():扫描全部
                //basePackage:指定要扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.kuang.swaggerdemo.controller"))
                //paths过滤什么路径
//                .paths(PathSelectors.ant("/kuang/**"))
                .build();
    }

    //配置Swagger信息=apiInfo
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("秦将", "https://www.bilibili.com/", "123456@163.com");

        return new ApiInfo("狂神的SwaggerAPI文档","这个作者有点苦","v1.0","https://www.bilibili.com/",contact,"Apache 2.0","http://www.apache.org/licenses/LICENSE-2.0",new ArrayList());

    }

}
