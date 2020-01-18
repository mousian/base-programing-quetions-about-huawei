package com.mousian.practice;

/**
 * 公司名称: 国誉创富(深圳)国际金融服务有限公司
 * 项目名: base-programing-questions-about-huawei
 * 文件名: com.mousian.practice
 * Copyright (C) 2020 Co. Ltd. www.huashengguotong.com
 * All rights reserved.
 */

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

/**
 * 蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
 *
 *
 *
 *
 *
 *
 *
 * 样例输入
 *
 * 5
 *
 * 样例输出
 *
 * 1 3 6 10 15
 *
 * 2 5 9 14
 *
 * 4 8 13
 *
 * 7 12
 *
 * 11
 *
 * 接口说明
 *
 * 原型
 *
 * void GetResult(int Num, char * pResult);
 *
 * 输入参数：
 *
 *         int Num：输入的正整数N
 *
 * 输出参数：
 *
 *         int * pResult：指向存放蛇形矩阵的字符串指针
 *
 *         指针指向的内存区域保证有效
 *
 * 返回值：
 *
 *         void
 *
 *
 *
 *
 *
 * 输入描述:
 * 输入正整数N（N不大于100）
 *
 * 输出描述:
 * 输出一个N行的蛇形矩阵。
 *
 * 示例1
 * 输入
 * 复制
 * 4
 * 输出
 * 复制
 * 1 3 6 10
 * 2 5 9
 * 4 8
 * 7
 */

public class 蛇形数组 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        arr[0][0]=1;
        int temp = 1;
        //横向数组的长度
        int xLength = arr.length;
        for(int i = 0;i<arr.length;i++){
            //先算出第一列的数，然后从后面依次获取等差值增加
            if(i>0){
                arr[i][0] = arr[i-1][0]+temp;
                temp++;
            }
            System.out.print(arr[i][0]+" ");
            int tempX = temp+1;
            for(int j = 1;j<xLength;j++){
                if(j>0){
                    arr[i][j]=arr[i][j-1]+tempX;
                }
                if(j<xLength-1){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.println(arr[i][j]);
                }
                tempX++;
            }
            xLength--;
        }
        scanner.close();
    }

}
