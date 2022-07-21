import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("age:");
        int age = sc.nextInt();
        System.out.println("name");
        String name = sc.next();
        System.out.println("score");
        double score = sc.nextDouble();
        System.out.println("age:"+age+",name:"+name+",score:"+score);
    }
}