package com.Pa1.base;

public class Demo04 {
    public static void main(String[] args) {
        //整数拓展：进制

        int i=10;
        int i2=010;//八进制
        int i3=0x10;//十六进制

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("//================================================");

        //================================================
        //浮点数拓展 银行业务变量表示
        //BigDecimal 数学工具类
        //================================================

        float f=0.1f; //0.1
        double d=1.0/10; //0.1

        System.out.println(f==d);//false
        System.out.println(f);
        System.out.println(d);

        float d1=23132322312312313f;
        float d2=d1+1;

        System.out.println(d1==d2);//true

        //================================================
        //字符扩展
        //================================================

        char c1='a';
        char c2='中';

        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);

        //字符本质是数字

        char c3='\u0061';
        System.out.println(c3);//a

        //转义字符
        //\t 制表符
        //\n 换行
        System.out.println("Hello\nWorld");


        //
        System.out.println("//================================================");
        String sa = new String("hello world");//original不用打出来
        String sb = new String( "hello world");
        System.out.println(sa==sb);

        String sc="hello world";
        String sd="hello world";
        System.out.println(sc==sd);
        //对象从内存分析

        //布尔值扩展
        boolean flag = true;

        if(flag==true){
        }
        if(flag){
        }
        //第二个更加精简
    }
}
