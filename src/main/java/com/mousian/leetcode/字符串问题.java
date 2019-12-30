package com.mousian.leetcode;

public class 字符串问题 {

    public static void main(String[] args) {
        System.out.println(new 字符串问题().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }


    public String addBinary(String a, String b) {
        //将字符串转为数字，然后转为10进制数字
        //将10进制数字相加
        long c = transToTen(a);
        long d = transToTen(b);
        long sum = c + d;
        //将10进制数转为二进制字符串
        return transToTwo(sum);
    }

    private long transToTen(String str) {
        char[] chars = str.toCharArray();
        double sum = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            double pow = Math.pow(2, i);
            Integer base = Integer.valueOf(Character.toString(chars[chars.length - i - 1]));
            sum = sum + base * pow;
        }
        return Double.valueOf(sum).longValue();
    }

    private String transToTwo(long in) {
        StringBuilder stringBuilder = new StringBuilder();
        if (in == 0) {
            stringBuilder.append(0);
        } else {
            while (in > 0) {
                stringBuilder.append(in % 2);
                in = in / 2;
            }
        }
        return stringBuilder.reverse().toString();
    }

    public String twoAdd(String a, String b) {
        char[] chA, chB;
        //先给短的补0
        if (a.length() > b.length()) {
            StringBuilder sb = new StringBuilder(a);
            sb.reverse();
            for (int i = b.length() - 1; i < a.length(); i++) {
                sb.append("0");
            }
            b = sb.reverse().toString();
        } else if (a.length() < b.length()) {
            StringBuilder sb = new StringBuilder(b);
            sb.reverse();
            for (int i = a.length() - 1; i < b.length(); i++) {
                sb.append("0");
            }
            a = sb.reverse().toString();
        }
        chA = a.toCharArray();
        chB = b.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        for (int i = 0; i < chA.length; i++) {
            if (n + chA[chA.length - 1 - i] + chB[chA.length - 1 - i] == 0) {
                stringBuilder.append(0);
            } else if (n + chA[chA.length - 1 - i] + chB[chA.length - 1 - i] == 1) {
                stringBuilder.append(1);
            } else if (n + chA[chA.length - 1 - i] + chB[chA.length - 1 - i] == 2) {
                stringBuilder.append(0);
                n = 1;
            } else if (n + chA[chA.length - 1 - i] + chB[chA.length - 1 - i] == 3) {
                stringBuilder.append(1);
                n = 1;
            }
        }
        return stringBuilder.toString();
    }


}
