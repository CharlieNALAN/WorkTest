package cn.banyuan.homework;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year<0||year>3000){
            System.out.println("年份有误！");
        }
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
    }
}
