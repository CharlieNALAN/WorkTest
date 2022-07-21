import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的分数");
        int score = sc.nextInt();
        if(score>90)
            System.out.println("A");
        else if(score>80)
            System.out.println("B");
        else if(score>70)
            System.out.println("C");
        else
            System.out.println("D");

    }






}
