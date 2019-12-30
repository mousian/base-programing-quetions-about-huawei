package com.mousian.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class 投票计数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            //总候选人数
            int paNum = scanner.nextInt();
            //候选人清单
            Map<String,Integer> mapPa = new LinkedHashMap<>();
            //用表初始化记录候选人的票数
            for(int i =0 ;i<paNum;i++){
                mapPa.put(scanner.next(),0);
            }
            //添加无效记录
            mapPa.put("Invalid",0);
            //投票人的人数（总票数）
            int totalNum = scanner.nextInt();
//            String[] choosePa = scanner.nextLine().split("\\s+");

            //遍历投的票，计票
            for(int i = 0;i<totalNum;i++){
                String choosePa = scanner.next();
                //如果不是候选用户，则认为无效票
                if(!mapPa.containsKey(choosePa)){
                    mapPa.put("Invalid",mapPa.get("Invalid")+1);
                }else{
                    mapPa.put(choosePa,mapPa.get(choosePa)+1);
                }
            }
            for (String pName : mapPa.keySet()) {
                System.out.println(pName+" : "+mapPa.get(pName));
            }
        }
        scanner.close();
    }
}
