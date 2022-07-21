package cn.banyuan.homework;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = num1>num2? num1:num2;
        max = max>num3? max:num3;
        System.out.println(max);
    }
}
