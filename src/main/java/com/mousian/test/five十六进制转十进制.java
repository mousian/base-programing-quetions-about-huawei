package com.mousian.test;

import java.util.Scanner;

public class five十六进制转十进制 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strIn = scanner.nextLine();
        String str = strIn.substring(2);
        char[] chars = str.toCharArray();
        double rs=0;
        for (int i = 0;i<chars.length;i++){
            double pow = Math.pow(16, chars.length-1-i);
            switch (chars[i]){
                case 'A':
                    rs=rs+10*pow;
                    break;
                case 'B':
                    rs=rs+11*pow;
                    break;
                case 'C':
                    rs=rs+12*pow;
                    break;
                case 'D':
                    rs=rs+13*pow;
                    break;
                case 'E':
                    rs=rs+14*pow;
                    break;
                case 'F':
                    rs=rs+15*pow;
                    break;
                default:
                    Integer intCur = Integer.valueOf(chars[i]+"");
                    rs=rs+intCur*pow;
                    break;
            }
        }
        System.out.println(Double.valueOf(rs).intValue());
    }

}
