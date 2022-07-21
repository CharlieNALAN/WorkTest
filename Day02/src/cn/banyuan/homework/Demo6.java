package cn.banyuan.homework;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("货物重量为");
        int weight = sc.nextInt();
        double money;
        if(weight<20)
            money=5;
        else if(weight<100)
            money=5+(weight-20)*0.2;
        else
            money=5+80*0.2+(weight-100)*0.15;
        System.out.println(money);
    }
}
