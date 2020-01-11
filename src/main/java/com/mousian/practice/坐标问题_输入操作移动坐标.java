package com.mousian.practice;

import java.util.*;

public class 坐标问题_输入操作移动坐标 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] sps = line.split(";");
        int [] rs = {0,0};
        for (String operate:sps){
            try {
                if(operate.length()>1){
                    int step = Integer.valueOf(operate.substring(1));
                    //w= y+1  d=x+1  s=y-1 a=x-1
                    if(operate.charAt(0)=='A'){
                        rs[0] = rs[0]-step;
                    }else if(operate.charAt(0)=='S'){
                        rs[1] = rs[1]-step;
                    }else if(operate.charAt(0)=='D'){
                        rs[0] = rs[0]+step;
                    }else if(operate.charAt(0)=='W'){
                        rs[1] = rs[1]+step;
                    }
                }

            }catch (NumberFormatException e){
                continue;
            }
        }
        System.out.println(rs[0]+";"+rs[1]);
    }

//    private static int[] move(List<String> stringList) {
//        //第一位为x，第二位为y
//        int[] an = {0,0};
//        for (String operate:stringList){
//            String firsChar = operate.substring(0,1);
//            Integer step= Integer.valueOf(operate.substring(1));
//            //w= y+1  d=x+1  s=y-1 a=x-1
//            switch (firsChar){
//                case "A":
//                    an[0] = an[0]-step;
//                    break;
//                case "S":
//                    an[1] = an[1]-step;
//                    break;
//                case "W":
//                    an[1] = an[1]+step;
//                    break;
//                case "D":
//                    an[0] = an[0]+step;
//                    break;
//            }
//        }
//        return an;
//    }
//
//    private static List<String> delInvalidOperate(List<String> sps) {
//        List<String> res = new ArrayList<>();
//        for(String str: sps){
//            if(str.length()<2){
//                continue;
//            }
//            //要求第一个字符为ASDW中的一个，后面为纯数字
//            String firsChar = str.substring(0,1);
//            String remainStr = str.substring(1);
//            if(isFirstValidate(firsChar)&&isNumber(remainStr)){
//                res.add(str);
//            }
//        }
//        return res;
//    }
//
//    public static boolean isFirstValidate(String firstChar){
//        String[] strCodes = {"A", "S", "D", "W"};
//        List codes = Arrays.asList(strCodes);
//        if(codes.contains(firstChar)){
//            return true;
//        }
//        return false;
//    }
//
//
//    public static boolean isNumber(String strNum){
//        char[] chars = strNum.toCharArray();
//        for (char ch:chars){
//            if(!Character.isDigit(ch)){
//                return false;
//            }
//        }
//        return true;
//    }
}
