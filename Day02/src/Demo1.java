import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Java考了多少分");
        int javaScore = sc.nextInt();
        System.out.println("音乐考了多少分");
        int musicScore = sc.nextInt();
        if(javaScore>98&&musicScore>80)
            System.out.println("奖励");
        else if(javaScore>100&&musicScore>70)
            System.out.println("奖励");
        System.out.println("结束");
    }
}
