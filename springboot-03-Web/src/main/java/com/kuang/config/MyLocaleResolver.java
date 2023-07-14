package com.kuang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;


public class MyLocaleResolver implements LocaleResolver{
    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String language = request.getParameter("l");//获取请求中的语言参数

        Locale local=Locale.getDefault();//如果没有就使用默认的

        //如果请求的链接带了国际化的参数
        if(!StringUtils.isEmpty(language)){
            //zh_CN
            String[] s = language.split("_");
            //国家，地区
            local = new Locale(s[0], s[1]);
        }

        return local;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
