package com.Pa1.method;

public class Demo02 {
    public static void main(String[] args) {
        double max= max(10.0,10.0);
        System.out.println(max);
    }

    //比大小
    //Java只有值传递
    public static int max(int num1,int num2) {
        int result=0;

        if(num1==num2){
            System.out.println("num1=num1");
            return 0;
        }
        if(num1>num2){
            result=num1;
        }
        if(num2>num1){
            result=num2;
        }
        return result;
    }
    public static double max(double num1,double num2) {
        double result=0;

        if(num1==num2){
            System.out.println("num1=num1");
            return 0;
        }
        if(num1>num2){
            result=num1;
        }
        if(num2>num1){
            result=num2;
        }
        return result;
    }
    public static int max(int num1,int num2,int num3) {
        int result=0;

        if(num1==num2){
            System.out.println("num1=num1");
            return 0;
        }
        if(num1>num2){
            result=num1;
        }
        if(num2>num1){
            result=num2;
        }
        return result;
    }
}
