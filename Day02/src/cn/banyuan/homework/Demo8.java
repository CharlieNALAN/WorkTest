package cn.banyuan.homework;

public class Demo8 {
    public static void main(String[] args) {
        int a=3,b=5;
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
