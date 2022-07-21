package cn.banyuan.test;

import java.util.Scanner;

public class Ans4 {
    public static void main(String[] args) {
        String[] arr={"a","b","c","e","f","p","u","z",null};
        for(int i=0;i<8;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("待插入的字符是:");
        Scanner sc = new Scanner(System.in);
        String alpha = sc.next();
        int index= arr.length-1;
        for(int i=0;i< arr.length;i++){
            if(alpha.charAt(0)<arr[i].charAt(0)){
                index=i;
                for(int j= arr.length-1;j>index;j--){
                    arr[j]=arr[j-1];
                }
                arr[index]=alpha;
                break;
            }
        }
        System.out.println("插入的下标是："+index);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
