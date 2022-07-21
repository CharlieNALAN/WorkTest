package cn.banyuan.chap2;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入一");
        for(int i=100;i<1000;i++)
        {
            int a=i%10;
            int b=i/10%10;
            int c=i/100;
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i)
                System.out.print(i+" ");
        }
    }
}
