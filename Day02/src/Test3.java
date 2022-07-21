import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Java考了多少分");
        int score = sc.nextInt();
        if(score>98)
            System.out.println("奖励MP4");
        else
            System.out.println("滚去编码");

    }

//        byte a = 127;
//        System.out.println(++a);
}
