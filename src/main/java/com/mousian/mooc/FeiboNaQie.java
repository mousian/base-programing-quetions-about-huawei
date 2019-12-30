package com.mousian.mooc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FeiboNaQie {

    public static void main(String[] args) {

        //需求：输入第n个数，求斐波那契数列中n个数对应的值

//        int a,b;
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();

//        System.out.println(fic(6));
        String s = Long.toUnsignedString(23,8);
        System.out.println(s);


    }

    //递归解法
    public static int fib(int n){
        if (n==1||n==2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    //动态规划解法:将原问题拆解成若干子问题，同时保存子问题的答案，
    // 使得每个子问题只求解一次，最终获得原问题的答案。
    public static int fic(int n){
        int[] ns= new int[n];
        //n为第n项
        //f1=1;f2=1;fn=f(n-1)+f(n-2)
        ns[0]=1;
        ns[1]=1;
        for(int i = 2;i<n;i++){
          ns[i]=ns[i-1]+ns[i-2];
        }
        return ns[n-1];
    }

}
