package com.Pa1.struct;

public class forDemo05 {
    public static void main(String[] args) {
        int[] numbers={10,20,30,4,50};//定义一个数组

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("=============");
        //遍历数组中的元素
        for(int x:numbers){
            System.out.println(x);
        }
    }
}