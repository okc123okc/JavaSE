package com.okc.array;

/**
 * @ClassName: ArrayDemo07 稀疏数组
 * @Author: okc
 * @Date: 2021/4/17 21:49
 * @Version 1.8
 **/
public class ArrayDemo07 {
    public static void main(String[] args) {
        //创建一个二维数组11*11 0:没有 1:黑子 2:白子
        int[][] array1 = new int[11][11];
        array1[1][2]=1;
        array1[2][3]=2;
        //输出原始的数组
        System.out.println("输出原始的数组：");
        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        System.out.println("==========================================");
        //转换为稀疏数组保存
        //获取有效值的个数
        int sum = 0;
        for (int i = 0 ; i < 11 ; i++) {
            for (int j = 0 ; j < 11 ; j++) {
                if (array1[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("有效值的个数：" + sum);
        //创建一个稀疏数组
        int[][] array2 = new int[sum+1][3];
        array2[0][0]=11;
        array2[0][1]=11;
        array2[0][2]=sum;
        //遍历二维数组，将非零值存放到稀疏数组
        int count = 0;
        for (int i = 0 ; i < array1.length ; i++) {
            for (int j = 0 ; j < array1.length  ; j++) {
                if (array1[i][j]!=0){
                    count++;
                    array2[count][0]= i;
                    array2[count][1]=j;
                    array2[count][2]=array1[i][j];
                }
            }
        }
        //输出稀疏数组
        System.out.println("稀疏数组:");
        for (int i = 0 ; i < array2.length  ; i++) {
            for (int j = 0 ; j < array2.length  ; j++) {
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("=========================================");
        //还原稀疏数组
        //读取稀疏数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        //给其中的元素还原值
        for (int i = 1 ; i < array2.length ; i++) {
            for (int j = 0 ; j < array2.length  ; j++) {
                if (array2[i][j]!=0){
                    array3[array2[i][0]][array2[i][1]]= array2[i][2];
                }
            }
        }
        //输出还原的稀疏数组
        System.out.println("还原的数组：");
        for (int i = 0 ; i < array3.length ; i++) {
            for (int j = 0 ; j < array3.length ; j++) {
                System.out.print(array3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
