package cn.banyuan.chap2;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数");
        int n = sc.nextInt();
        int sum=1;
        for(;n>0;n--){
            sum*=n;
        }
        System.out.println(sum);
    }
}
