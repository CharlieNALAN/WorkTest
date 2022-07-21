package cn.banyuan.homework;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0,sumLowAge = 0,sumHighAge = 0;
        for(int i = 1;i<=10;i++){
            System.out.print("请输入第"+i+"位顾客的年龄:");
            age = sc.nextInt();
            if(age<30)
                sumLowAge++;
            else
                sumHighAge++;
        }
        double lowAgeRate=(double)sumLowAge*10;
        double highAgeRate=(double)sumHighAge*10;
        System.out.println("30岁以下的比例是:"+lowAgeRate+"%");
        System.out.println("30岁以上的比例是:"+highAgeRate+"%");
    }
}
