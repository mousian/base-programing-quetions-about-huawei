package com.mousian.practice;


import java.util.*;

public class nine整数去重 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strInVal = scanner.nextLine();
        //倒序输入到SortedSet
        Set<Character> result = new LinkedHashSet<>();
        char[] chars = strInVal.toCharArray();
        for (int i = chars.length-1;i>=0;i--){
            result.add(chars[i]);
        }
        for (char ch:result) {
            System.out.print(ch+"");
        }
    }

}
