package com.mousian.practice;


import java.util.Scanner;

/**
 * 题目描述
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 *
 * 输入描述:
 * 第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 *
 * 输出描述:
 * 输出输入字符串中含有该字符的个数。
 *
 * 示例1
 * 输入
 * 复制
 * ABCDEF
 * A
 * 输出
 * 复制
 * 1
 */

public class two统计字符串中某字符的长度 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fstLine = new String();
        String sndLine = new String();
        int count = 0;
        while (scanner.hasNextLine()){
            if(count==0){
                fstLine=scanner.nextLine();
                count++;
            }else{
                sndLine=scanner.nextLine();

                //获取到第二行，开始统计操作，并输出
                //循环遍历计数
                int c = 0;
                char[] chars = fstLine.toCharArray();
                for (int i =0;i<chars.length-1;i++){
                    if(String.valueOf(chars[i]).equalsIgnoreCase(sndLine)){
                        c++;
                    }
                }
                System.out.println(c);

                //计算完成，重新输入
                count=0;
            }
        }


    }

}
