package cn.banyuan.chap2;

import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        int num = sc.nextInt();
        boolean flag = true;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0) {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("是素数");
        else
            System.out.println("不是素数");
    }
}
