package com.mousian.practice;

import java.util.Scanner;

public class 十六进制转十进制数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] in = scanner.next().substring(2).toCharArray();
        double result = 0;
        for(int i = 0;i<in.length;i++){
            double pow = Math.pow(16,in.length-1-i);
            switch (in[i]){
                case 'A':
                    result =result+10*pow;
                    break;
                case 'B':
                    result =result+11*pow;
                    break;
                case 'C':
                    result =result+12*pow;
                    break;
                case 'D':
                    result =result+13*pow;
                    break;
                case 'E':
                    result =result+14*pow;
                    break;
                case 'F':
                    result =result+15*pow;
                    break;
                default:
                    result=result+Integer.valueOf(in[i]+"")*pow;
                    break;
            }
        }
        System.out.println(Double.valueOf(result).intValue());
    }

}
