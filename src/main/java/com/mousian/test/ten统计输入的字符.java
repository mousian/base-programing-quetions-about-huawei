package com.mousian.test;

import  java.util.*;

public class ten统计输入的字符 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strIn = scanner.nextLine();
        char[] chars = strIn.toCharArray();
        System.out.println(chars.length);
    }

}
