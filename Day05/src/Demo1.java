import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int score ,sum;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            sum=0;
            System.out.println("输入第"+i+"个班成绩");
            for(int j=1;j<=4;j++){
                System.out.print("输入第"+j+"个人成绩:");
                score = sc.nextInt();
                sum+=score;
            }
            System.out.println("第"+i+"个班的总分是"+sum);
        }
    }
}
