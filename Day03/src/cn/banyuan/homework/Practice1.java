package cn.banyuan.homework;

public class Practice1 {
    public static void main(String[] args) {
        int year = 0;
        int people = 250000;
        while(people<1000000){
            people = (int) (people* 1.25);
            year++;
        }
        System.out.println(year);
    }
}
