package com.mousian.practice;

import java.util.Scanner;

/**
 * 题目描述
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *
 * 输入描述:
 * 输入int型表示month
 *
 * 输出描述:
 * 输出兔子总数int型
 *
 * 示例1
 * 输入
 * 9
 * 输出
 * 34
 *
 */
public class 统计兔子每个月的兔子数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(f(scanner.nextInt()));
        scanner.close();
    }

    private static int f(int month){
        //定义初始态
        if(month==1 || month==2){
            return 1;
        }else{
            //定义递归运算
            return f(month-1)+f(month-2);
        }
    }


}
