package com.Pa1.scanner;

import java.util.Scanner;

public class Demo021 {
    public static void main(String[] args) {
        //我们可以输入多个数字，并求其总和与平均值，每输入一个数用回车确认，通过输入非数字来结束循环
        Scanner scanner=new Scanner(System.in );

        //和
        double sum=0;
        //计算输入了多少个数字
        int m=0;

        //通过循环判断是否还有输入，并在里面对每一次求和进行统计
        while(scanner.hasNextDouble())
        {   double x=scanner.nextDouble();
            m=m+1;//m++
            sum+=x;
            System.out.println("你输入了第"+m+"数据，并且当前结果sum="+sum);
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均数是"+sum/m);
        scanner.close();
    }
}
