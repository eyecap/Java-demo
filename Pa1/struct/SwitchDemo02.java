package com.Pa1.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String  name="秦将";
        //JDK7的新特性，表达式结果可以是字符串！！
        //字符的本质还是数字

        //反编译 java---class(字节码文件）---反编码

        switch(name){
            case"秦将":
                System.out.println("秦将");
                break;
            case"狂神":
                System.out.println("狂神");
                break;
            default:
                System.out.println("gu");
                break;
        }
        //可以用class文件暴力拖拽到java此文件夹中，生成对应的反编码文件
    }
}
