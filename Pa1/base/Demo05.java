package com.Pa1.base;

public class Demo05 {
    public static void main(String[] args) {
        int i=128;
        byte b=(byte)i;

        //强制转换 （类型）变量名 高到低
        //自动转换  低到高
        System.out.println(i);
        System.out.println(b);

        /*
        注意点
        布尔值不能进行类型转换
        高到低，强制类型转换；内存溢出问题，精度问题
         */

        System.out.println("//================================");
        System.out.println((int)23.7);//23
        System.out.println((int)-45.89f);//-45

        System.out.println("//================================");
        char c='a';
        int d=c+1;
        System.out.println(d);
        System.out.println((char)d);

        //数字之间可以用下划线分割
        int money=10_0000_0000;
        int years=20;

        //运算溢出情况下的类型转换
        int total=money*years;
        long total2=money*years;
        long total3=money*(long)years;
        System.out.println(total3);

    }
}
