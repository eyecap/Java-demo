package com.Pa1.array;

import java.util.Arrays;

public class ArraysDemo06 {
    public static void main(String[] args) {
        int[] a={1,2,3,46,5};
        //打印数组元素
//        System.out.println(Arrays.toString(a));
//        printArray(a);
        //数组排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //数组填充(左闭右开，最右边不包括）
        Arrays.fill(a,2,4,0);
        System.out.println(Arrays.toString(a));
    }

    public static void printArray(int[] a) {
        for (int i=0;i<a.length;i++) {
            if (i == 0) {
                System.out.print("["+a[i]+",");
            }
            else if (i == a.length - 1) {
                System.out.print(a[i]+"]");
            }
            else {
                System.out.print(a[i]+",");
            }
        }

    }


}
