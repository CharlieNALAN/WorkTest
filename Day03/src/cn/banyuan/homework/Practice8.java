package cn.banyuan.homework;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入班级总人数:");
        int total = sc.nextInt();
        int score,sum=0;
        for(int i=1;i<=total;i++){
            System.out.print("请输入第"+i+"位学生的成绩:");
            score=sc.nextInt();
            if(score>80)
                sum++;
        }
        System.out.println("80分以上的学生的人数是:"+sum);
        double rate = (double)sum/total*100;
        System.out.println("80分以上的学生所占的比例为"+rate+"%");
    }
}
