package com.Pa1.array;

import java.util.Arrays;

public class ArraysDemo07 {
    public static void main(String[] args) {
        int[] a={1,2,34,5,6,89,1,2,3,5,6,64,2};

        int[] sort=sort(a);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] array) {
        //临时变量
        int temp=0;
        //外层循环，判断我们最多走多少次
        for (int i = 0; i < array.length-1; i++) {
            boolean flag=false;
            for (int j = 0; j <array.length-1-i; j++) {
        //内层循环，比较每两个数
                if(array[j+1]>array[j]){
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }
    return  array;
    }
}
