package cn.banyuan.homework;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入学生姓名");
        String name = sc.next();
        int score = 0,sum = 0;
        for(int i=1;i<=5;i++){
            System.out.print("请输入5门功课中第"+i+"门课的成绩:");
            score=sc.nextInt();
            sum+=score;
        }
        double avg =(double) sum/5;
        System.out.println(name+"的平均分是："+avg);
    }
}
