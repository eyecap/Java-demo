package com.Pa1.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //声明一个数组
        int[] nums;
        //创建一个数组
        nums=new int[10];
        //给数组元素赋值
        nums[0]=5;
        nums[1]=4;
        //给数组元素求和
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        System.out.println(sum);
    }


}
