package com.mousian.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 人民币转换 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String strIn  = scanner.nextLine();
        Map<String,String> mapX = new HashMap<>();
        mapX.put("1","壹");
        mapX.put("2","贰");
        mapX.put("3","叁");
        mapX.put("4","肆");
        mapX.put("5","伍");
        mapX.put("6","陆");
        mapX.put("7","柒");
        mapX.put("8","捌");
        mapX.put("9","玖");
        mapX.put("0","零");

        Map<String,String> mapToken = new HashMap<>();
        mapToken.put("0","元");
        mapToken.put("1","拾");
        mapToken.put("2","佰");
        mapToken.put("3","仟");

        mapToken.put("4","万");

        mapToken.put("5","拾");
        mapToken.put("6","佰");
        mapToken.put("7","仟");

        mapToken.put("8","亿");

        mapToken.put("9","拾");
        mapToken.put("10","佰");
        mapToken.put("11","仟");
        mapToken.put("12","万");

        char[] chars = strIn.split(".")[0].toCharArray();
        char[] charsLitte = strIn.split(".")[1].toCharArray();
        //整个位
        String[] x = new String[chars.length];
        String[] y = new String[charsLitte.length];
        String[] tokenX = new String[chars.length];
        String[] tokenY = new String[charsLitte.length];
        for(int i = 0 ;i<chars.length;i++){
            x[i] = mapX.get(chars[i]+"");
            tokenX[i] = mapToken.get(chars[chars.length-1-i]+"");
        }

    }

}





