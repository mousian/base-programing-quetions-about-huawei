package com.mousian.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目描述
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入描述:
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 * <p>
 * 输出描述:
 * 输出到长度为8的新字符串数组
 * <p>
 * 示例1
 * 输入
 * abc
 * 123456789
 * 输出
 * abc00000
 * 12345678
 * 90000000
 */


public class four将字符串输出为长度为8的字符不足则补0 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strA = scanner.nextLine();
        String strB = scanner.nextLine();
        String[] strRs = new String[]{};

        List<String> strList = new LinkedList<>();
        generalStringList(strList,strA);
        generalStringList(strList,strB);
        for (String str:strList){
            System.out.println(str);
        }
    }

    public static void generalStringList(List<String> strList, String str){
        String tempStr = str;
        List<String> tempList = new LinkedList<>();
        while (splitStr(tempList,tempStr)!=null){
            tempStr = splitStr(tempList,tempStr);
        }
        for (int i = 0;i<tempList.size();i=i+2){
            strList.add(tempList.get(i));
        }
    }


    public static String splitStr(List<String> strList, String str) {
        if (str.length() <= 8) {
            int zeroNum = 8 - str.length();
            StringBuilder stringBuilder = new StringBuilder(str);
            for (int i =0;i<zeroNum;i++){
                stringBuilder.append(0);
            }
            strList.add(stringBuilder.toString());
            return null;
        }else if(str.length() >8 ){
            String strEight = str.substring(0, 8);
            strList.add(strEight);
            String substring = str.substring(8);
            return substring;
        }

        return null;
    }


}
