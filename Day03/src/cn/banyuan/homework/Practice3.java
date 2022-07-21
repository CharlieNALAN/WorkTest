package cn.banyuan.homework;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println("Myshopping管理系统 > 购物结算");
        System.out.println("*************************************");
        System.out.println("请选择购买的商品编号");
        System.out.println("1.T恤    2.网球鞋    3.网球拍");
        System.out.println("*************************************");
        Scanner sc = new Scanner(System.in);
        String choice=null;
        int num = 0;
        do{
            System.out.print("请选择商品编号:");
            num = sc.nextInt();
            if(num==1)
                System.out.println("T恤       ￥245.0");
            else if(num==2)
                System.out.println("网球鞋     ￥300.0");
            else
                System.out.println("网球拍     ￥150.0");
            System.out.print("是否继续(Y/N)");
            choice = sc.next();
        }while("Y".equals(choice));
        System.out.println("程序结束");
    }
}
