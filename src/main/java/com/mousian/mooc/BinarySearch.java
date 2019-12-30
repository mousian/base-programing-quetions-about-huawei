package com.mousian.mooc;

public class BinarySearch {


    public static void main(String[] args) {
        //定义一个有序数组
        int[] list = {1,3,4,6,8,10,13};
        int i = binarySearch(list, 6);
        System.out.println(list[i]);

    }

    public static int binarySearch(int[] list,int n){
        //1.找到中间数
        int low=0;
        int high=list.length-1;
        int mid;
        while (low<=high){
            mid = low+(high-low)/2;
            if(list[mid]==n){
                return mid;
            }else if(list[mid]>n){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }


}
