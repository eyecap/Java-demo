package com.Pa1.array;

public class ArraysDemo05 {
    public static void main(String[] args) {
        int[][] array={{1,2},{3,4},{2,3},{4,5}};

        //行类数
        System.out.println(array.length);
        System.out.println(array[0].length);

        System.out.println("=================");
        //遍历输出
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
    }
}
