package com.mousian.test;

import java.util.Arrays;
import java.util.Scanner;

public class 走棋盘 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //横向格子数
        int n = scanner.nextInt();
        //纵向格子数
        int m = scanner.nextInt();

        System.out.println(calStep(n, m));
        //格子矩阵，包含外墙。初始点在(0,0)
//        int[][] gezi = new int[n][m];
//
//        for(int i =0 ;i<gezi.length;i++){
//            for (int j = 0;j<gezi[i].length;j++){
//                //如果右侧有0位则向右走
//                if(gezi[i+1][j]==0){
//                    gezi[i][j]=1;
//                }
//                //如果右侧不通，则向下走
//                else{
//                    if(gezi){
//
//                    }
//                }
//            }
//        }
    }


    //递归解法
    public static int calSteps(int n, int m) {
        //初始状态
        if (m == 0 || n == 0) {
            return 1;
        } else {
            //将步骤拆解为若干个小步骤，每次都有右边与左边两种可能，所以是两种情况的和
            return calSteps(n - 1, m) + calSteps(n, m - 1);
        }
    }

    //动态规划解法（列表）   f(0,m)=1;f(n,0)=1;f(m,n)=f(n-1,m)+f(m,m-1)
    public static int calStep(int n, int m) {
        int[][] nums = new int[n + 1][m + 1];
//        nums[0][0] = 0;
        for (int i = 0; i < n + 1; i++) {
            nums[i][0] = 1;
        }
        for (int i = 0; i < m + 1; i++) {
            nums[0][i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < nums[i].length; j++) {
                nums[i][j] = nums[i - 1][j] + nums[i][j - 1];
            }
        }
        return nums[n][m];
    }

}
