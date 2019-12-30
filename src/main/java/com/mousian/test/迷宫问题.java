package com.mousian.test;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 迷宫问题 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] maze = new int[n][m];
            for (int i = 0;i<n;i++){
                for (int j = 0;j<m;j++){
                    maze[i][j]=scanner.nextInt();
                }
            }
            //开始查找坐标
            //用于记录踪迹
            Map<Integer, Integer> map = new HashMap<>();
            //记录原点
            map.put(0,0);
            for (int i = 0;i<maze.length;i++){
                for(int j = 0;j<maze[i].length;j++){
                    //避开原点
                    if(i==0&&j==0){
                        System.out.println("("+i+","+j+")");
                        continue;
                    }
                    //判断这个点是不是可以走
                    if(maze[i][j]==0){
                        //判断这个点上一个点是不是已经记录(即走过)，如果临近点也走过，就记录该值
                        if((map.containsKey(i-1)&&map.get(i-1)==j)
                                || (map.containsKey(i)&&map.get(i)==j-1)){
                            map.put(i,j);
                            System.out.println("("+i+","+j+")");
                        }
                    }
                }
            }
        }
    }
}
