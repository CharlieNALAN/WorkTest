package cn.banyuan.homework;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数");
        int num2 = sc.nextInt();
        System.out.println("输入运算符");
        String symbol = sc.next();
        double ans = 0;
        switch (symbol){
            case "+":
                ans=num1+num2;
                break;
            case "-":
                ans=num1-num2;
                break;
            case "*":
                ans=num1*num2;
                break;
            case "/":
                ans=(double)num1/num2;
        }
        System.out.println(ans);
    }
}
