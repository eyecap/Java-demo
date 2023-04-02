package com.Pa1.operator;

public class Demo02 {
    public static void main(String[] args) {
        //自增自减运算
        int a=3;

        int b=a++;//a赋值b,a+1赋值a
        System.out.println(a);

        int c=++a;//a+1赋值b,a+1赋值a
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //幂运算 工具类操作
        double pow=Math.pow(3,2);

        System.out.println(pow);

    }


}
