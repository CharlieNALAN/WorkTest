package cn.banyuan.chap2;

import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        int num = sc.nextInt();
        int sum = 0,temp;
        while(num!=0)
        {
            temp=num%10;
            sum+=temp;
            num/=10;
        }
        System.out.println(sum);
    }
}
