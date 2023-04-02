package com.Pa1.operator;

public class Demo03 {
    public static void main(String[] args) {
        //与或非逻辑运算
        boolean a=true;
        boolean b=false;

        System.out.println("a&&b:"+(a&&b));
        System.out.println("a||b:"+(a||b));
        System.out.println("!(a&&b):"+(!(a&&b)));

        //短路运算
        System.out.println("//============================");

        int c=5;
        boolean d=(c<4)&&(c++<4);

        System.out.println(d);
        System.out.println(c);//c=5而不是6

        //位运算
        System.out.println("//============================");
        /*int A = 00111100;
          int B = 00001101;
          System.out.println(A&B);
          System.out.println(A|B);
          System.out.println(A^B);
          System.out.println(~B);*/

        System.out.println(2<<3);


    }
}
