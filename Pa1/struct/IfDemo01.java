package com.Pa1.struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        //equals:判断字符串是否相等
        if(s.equals("hello")){
            System.out.println(s);
        }
        System.out.println("end");
        scanner.close();
    }
}
