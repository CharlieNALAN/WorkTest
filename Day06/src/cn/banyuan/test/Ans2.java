package cn.banyuan.test;

import java.util.Arrays;

public class Ans2 {
    public static void main(String[] args) {
        int[] arr = {1,3,44,5,4,77,55,6};
        System.out.println("排序前："+Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("排序后："+Arrays.toString(arr));
    }
}
