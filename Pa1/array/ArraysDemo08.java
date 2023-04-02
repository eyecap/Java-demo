package com.Pa1.array;

public class ArraysDemo08 {
    public static void main(String[] args) {
        //创建一个二维数组 0没有棋子 1黑棋 2白棋
        int[][] array=new int[11][11];
        array[1][2]=1;
        array[2][3]=2;
        //输出原始数组
        System.out.println("输出原始数组");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        System.out.println("==============");

        //转换为稀疏数组保存
        //获取有效值的个数
        int sum=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(array[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("有效值个数："+sum);
        //创建一个稀疏数组的数组
        int[][] array2=new int[sum+1][3];

        array2[0][0]=11;
        array2[0][1]=11;
        array2[0][2]=sum;

        //遍历一个二维数组，将非零值存入其中
        int count=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(array[i][j]!=0){
                    count++;
                    array2[count][0]=i;
                    array2[count][1]=j;
                    array2[count][2]=array[i][j];
                }
            }
        }
        //输出一个稀疏数组
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0]+"\t"+array2[i][1]+"\t"+array2[i][2]+"\t");
        }

        System.out.println("==============");
        System.out.println("还原");

        //读取稀疏数组
        int[][] array3=new int[array2[0][0]][array2[0][1]];
        //还原其值
        for (int i = 1; i <array2.length; i++) {
            array3[array2[i][0]][array2[i][1]]=array2[i][2];
        }
        //打印其值
        System.out.println("输出还原数组");
        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
