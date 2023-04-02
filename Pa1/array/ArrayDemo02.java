package com.Pa1.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化 声明+赋值
        int[] a={1,2,3,4,5,6,7,8};
        //动态初始化 声明+创建（赋默认初始值）
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

//        int[] b=new int[10];
//        b[0]=10;
//        b[1]=20;
//
//        System.out.println(b[0]);
//        System.out.println(b[1]);
//        System.out.println(b[2]);
//        System.out.println(b[3]);
        //ctrl+/快速注释

    }
}
