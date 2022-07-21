package cn.banyuan.test;

import java.util.Scanner;

public class Ans3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入行数:");
        int height = sc.nextInt();
        for(int i=1;i<=height;i++){
            for(int j=1;j<=height-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
