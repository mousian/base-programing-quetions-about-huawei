package com.mousian.test;

import java.util.Scanner;

public class six输出一个正整数的所有质数因子 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n>1){
            //1.从[2,N)找到质子因数
            int zhiShu = getZhiShu(n);
            System.out.print(zhiShu+" ");
            //2.拿N/质子因素得到数A，求数A的质子因数
            n = n/zhiShu;
        }
    }

    private static int getZhiShu(int n) {
        for(int i = 2;i<n;i++){
            if(n % i==0){
                return i;
            }
        }
        return n;
    }


}
