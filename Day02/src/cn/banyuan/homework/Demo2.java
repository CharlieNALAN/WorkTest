package cn.banyuan.homework;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("贝贝");
                break;
            case 2:
                System.out.println("京京");
                break;
            case 3:
                System.out.println("欢欢");
                break;
            case 4:
                System.out.println("莹莹");
                break;
            case 5:
                System.out.println("妮妮");
                break;
            default:
                System.out.println("北京欢迎你");
                break;
        }
    }
}
