package cn.banyuan.homework;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生姓名:");
        String name = sc.next();
        int score,sum=0;
        for(int i=1;i<=5;i++){
            System.out.print("请输入第"+i+"门课的成绩：");
            score=sc.nextInt();
            while(score<0||score>100){
                System.out.println("抱歉，分数录入错误，请重新输入");
                score=sc.nextInt();
            }
            sum+=score;
        }
        double avg=(double)sum/5;
        System.out.println(name+"的平均分为:"+avg);
    }
}
