package com.mousian.practice;

/**
 * 公司名称: 国誉创富(深圳)国际金融服务有限公司
 * 项目名: base-programing-questions-about-huawei
 * 文件名: com.mousian.practice
 * Copyright (C) 2020 Co. Ltd. www.huashengguotong.com
 * All rights reserved.
 */

import java.util.Scanner;

/**
 * 题目描述
 * Catcher是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，比如像这些ABBA，ABA，A，123321，但是他们有时会在开始或结束时加入一些无关的字符以防止别国破解。比如进行下列变化 ABBA->12ABBA,ABA->ABAKK,123321->51233214　。因为截获的串太长了，而且存在多种可能的情况（abaaab可看作是aba,或baaab的加密形式），Cathcer的工作量实在是太大了，他只能向电脑高手求助，你能帮Catcher找出最长的有效密码串吗？
 *
 *
 *
 * 输入描述:
 * 输入一个字符串
 *
 * 输出描述:
 * 返回有效密码串的最大长度
 *
 * 示例1
 * 输入
 * 复制
 * ABBA
 * 输出
 * 复制
 * 4
 */
public class 字符串密码截取_最长回文数 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String strIn = scanner.nextLine();

        System.out.println(fstMethod(strIn));
    }


    //暴力判断
    public static int fstMethod(String strIn){
        int max = 0;
        for (int i = 0;i<strIn.length()-1;i++){
            for (int j = i+1;j<=strIn.length();j++){
                String substring = strIn.substring(i, j);
                //如果是回文数，并且比记录值大，覆盖记录值
                if(substring.equals(new StringBuilder(substring).reverse().toString())  && substring.length()>max){
                    max = substring.length();
                }
            }
        }
        return max;
    }


    public static int sndMethod(String strIn){
        int max = 0;
        char[] chars = strIn.toCharArray();
        for (int i = 0;i<chars.length-1;i++){
            for (int j = chars.length;j>0;j--){

            }
        }
        return max;
    }

//    public static int isHuiWen(int start,int end){
//        int max = 0;
//        char[] chars = strIn.toCharArray();
//        for (int i = 0;i<chars.length-1;i++){
//            for (int j = chars.length;j>0;j--){
//
//            }
//        }
//        return max;
//    }

}
