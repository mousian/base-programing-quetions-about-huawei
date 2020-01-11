package com.mousian.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 判断密码是不是符合要求 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        List<String> boolList = new ArrayList<>();
        while ((str = bufferedReader.readLine()) != null) {
            if (str.trim().length() <= 8||isContainRepeat(str)) {
                boolList.add("NG");
                continue;
            }
            String[] splits = str.split("");
            //几种字符
            boolean isNum = false;
            boolean isLi = false;
            boolean isUp = false;
            boolean isOther = false;
            for (String sps : splits) {
                if (!isNum && isNum(sps)) {
                    isNum = true;
                }
                if (!isLi && isDownLitter(sps)) {
                    isLi = true;
                }
                if (!isUp && isUpperLitter(sps)) {
                    isUp = true;
                }
                if (!isOther && !(isNum(sps) && isDownLitter(sps) && isUpperLitter(sps))) {
                    isOther = true;
                }
            }
            if ((isNum && isLi && isUp) || (isNum && isLi && isOther) || (isNum && isUp && isOther)
                    || (isLi && isUp && isOther) || (isNum && isLi && isUp && isOther)) {
                boolList.add("OK");
            } else {
                boolList.add("NG");
            }
        }
        for (String rs : boolList) {
            System.out.println(rs);
        }
    }

    private static boolean isNum(String strArg) {
        return strArg.matches("[0-9]");
    }
    private static boolean isDownLitter(String strArg) {
        return strArg.matches("[a-z]");
    }
    private static boolean isUpperLitter(String strArg) {
        return strArg.matches("[A-Z]");
    }
    private static boolean isContainRepeat(String strArg) {
        char[] chars = strArg.toCharArray();
        for (int i = 0;i<chars.length;i++){
            for (int j = 3;j<chars.length;j++){
                if(chars[i]==chars[j]&&chars[i+1]==chars[j+1]&&chars[j+2]==chars[i+2]){
                    return true;
                }
            }
        }
        return false;
    }

}
