package com.Pa1.scanner;

import java.util.Scanner;

public class Demo011 {
    public static void main(String[] args) {
            //创建一个扫描器对象，用于接收键盘数据 （自动补全ait+enter）
            Scanner scanner= new Scanner(System.in);

            System.out.println("使用next方式接收：");

            //使用nextLine方式接收
            String str = scanner.nextLine();
            System.out.println("输出的内容为："+str);

            //凡是属于IO流的类如果不关闭就会一直占用资源，要养成好习惯用完就关掉
            scanner.close();
        }
}
