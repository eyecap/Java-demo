package com.Pa1.struct;

public class forDemo03 {
    public static void main(String[] args) {
        //练习2：用while或for循环输出1-1000之间能被5整除的数，并且每行输出3个
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            if (i % 15 == 0) {
                System.out.println();
            }
        }
        //转义字符为什么不用''呢?
    }
}

