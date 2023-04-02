package com.Pa1.operator;
public class Demo01 {
    public static void main(String[] args) {
        //二元运算符 同类型
        int a=10;
        int b=20;
        int c=25;
        int d=25;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);

        //二元运算符 不同类型
        System.out.println("//============================");
        long  a1=123123123123123L;
        int   b1=123;
        short c1=10;
        byte  d1=8;

        System.out.println(a1+b1+c1+d1);//long
        System.out.println(b1+c1+d1);//int
        System.out.println(c1+d1);//int

        //关系运算符
        System.out.println("//============================");
        int a2=10;
        int b2=20;

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //取余运算
        System.out.println("//============================");
        int a3=10;
        int b3=20;
        int c3=22;

        System.out.println(c3%a3);
    }
}





