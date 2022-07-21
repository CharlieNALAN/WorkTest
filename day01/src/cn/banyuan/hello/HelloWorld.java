package cn.banyuan.hello;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
//        String name = "蔡徐坤";
//        int age = 18;
//        String hobby = "唱 跳 rap 篮球";
//        boolean graduate = false;
//        double score = 74.1;
//        char level = 'S';
//        System.out.println(name + age + hobby + graduate + score + level);
        Scanner sc = new Scanner(System.in);
        System.out.println("品牌？");
        String brand = sc.next();
        System.out.println("重量？");
        double weight = sc.nextDouble();
        System.out.println("电池类型?");
        String type = sc.next();
        System.out.println("价格？");
        int price = sc.nextInt();
        System.out.println("品牌:"+brand);
        System.out.println("重量:"+weight);
        System.out.println("电池类型:"+type);
        System.out.println("价格:"+price);

    }
}