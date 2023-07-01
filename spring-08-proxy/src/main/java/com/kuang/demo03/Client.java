package com.kuang.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色：现在没有
        ProxyInvocationHandler pih= new ProxyInvocationHandler();

        //通过调用程序来处理角色，处理我们要调用的接口
        pih.setRent(host);

        Rent proxy=(Rent) pih.getProxy();//这里的proxy就是动态生成的，我们并没有写

        proxy.rent();
    }
}
