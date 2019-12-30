package com.mousian.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class 简单的错误记录 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String messageLine = null;
        Map<String, Integer> resultSet = new LinkedHashMap<>();
        while ((messageLine = bufferedReader.readLine())!=null){
            String[] strIn = messageLine.split("\\s+");
            String pathTemp = strIn[0];
            //路径名
            String path = pathTemp.substring(pathTemp.lastIndexOf("\\")+1);
            if (path.length() > 16) {
                path = path.substring(path.length()-16);
            }
            //行数
            int intLine = Integer.valueOf(strIn[1]);
            String strKey = path +" " +intLine;

            //累加行数
            if(resultSet.containsKey(strKey)){
                int count = resultSet.get(strKey);
                count++;
                resultSet.put(strKey,count);
            }else{
                resultSet.put(strKey,1);
            }
        }

        if (resultSet.size()>8){
            //输出最后8条
            int c = 0;
            for (String k : resultSet.keySet()){
                if(c>=resultSet.size()-1-8){
                    System.out.println(k+" "+resultSet.get(k));
                }
                c++;
            }
        }else{
            for (String k : resultSet.keySet()){
                System.out.println(k+" "+resultSet.get(k));
            }
        }
    }
}
