package cn.banyuan.chap2;

import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = sc.nextInt();
        int sum=0;
        while(num!=0){
            int temp=num&1;
            if(temp==1)
                sum++;
            num=num>>1;
        }
        System.out.println(sum);
    }
}
