package cn.banyuan.test;

import java.util.Scanner;

public class Ans1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=-1,score,sum=0;
        double avg;
        for(int i=1;i<=3;i++){
            sum = 0;
            max = -1;
            System.out.println("请输入第"+i+"个班的成绩");
            for(int j=1;j<=4;j++){
                System.out.print("请输入第"+j+"个同学成绩：");
                score = sc.nextInt();
                sum+=score;
                max=max>score?max:score;
            }
            avg=(double) sum/4;
            System.out.println("第"+i+"个班的平均分为："+avg+",最高分为:"+max);
            System.out.println();
        }
    }
}
