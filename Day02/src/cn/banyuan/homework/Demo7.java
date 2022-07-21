package cn.banyuan.homework;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        int rev;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的收入：");
        rev = sc.nextInt();
        if(rev<2000){
            sum = 0;
        }else if(rev < 2500){
            sum = (rev - 2000) * 0.05 ;
        }else if(rev <4000){
            sum = (500 * 0.05) + (rev - 2500)*0.1;
        }else if(rev < 7000){
            sum = (500 * 0.05) + (1500 * 0.1)+ (rev - 4000)*0.15;
        }else if(rev < 22000){
            sum = (500 * 0.05) + (1500 * 0.1)+ (3000 * 0.15) + (rev - 7000)*0.2;
        }else if(rev < 42000){
            sum = (500 * 0.05) + (1500 * 0.1)+ (3000 * 0.15) + (15000*0.2) + (rev - 22000)*0.25;
        }else if(rev < 62000){
            sum = (500 * 0.05) + (1500 * 0.1)+ (3000 * 0.15) + (15000*0.2) + (20000*0.25) + (rev - 42000)*0.3;
        }else if(rev < 82000){
            sum = (500 * 0.05) + (1500 * 0.1)+ (3000 * 0.15) + (15000*0.2) + (20000*0.25) + (20000 * 0.3) + (rev - 62000) * 0.35;
        }else if(rev <100000){
            sum = (500 * 0.05) + (1500 * 0.1)+ (3000 * 0.15) + (15000*0.2) + (20000*0.25) + (20000 * 0.3) + (20000 *0.35) + (rev - 82000)*0.4;
        }else {
            sum = (500 * 0.05) + (1500 * 0.1)+ (3000 * 0.15) + (15000*0.2) + (20000*0.25) + (20000 * 0.3) + (20000 *0.35) + (20000*0.4) + (rev - 102000)*0.45;
        }
        System.out.println("你的税收为："+sum);
    }
}
