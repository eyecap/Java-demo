package com.Pa1.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //从键盘接收数据
        int i=0;
        float f=0.0f;

        System.out.println("请输入整数：");

        //如果...那么
        if(scanner.hasNextInt()){
            i=scanner.nextInt();
            System.out.println("输入的整数为："+i);
        }
        else {
            System.out.println("输入的不是整数！");
        }

        System.out.println("请输入小数：");

        //如果...那么
        if(scanner.hasNextFloat()){
            f=scanner.nextFloat();
            System.out.println("输入的小数为："+f);
        }
        else {
            System.out.println("输入的不是小数！");
        }
        scanner.close();
    }
}
