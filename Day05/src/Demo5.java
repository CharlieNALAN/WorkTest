import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        int peopleSum = 0,score,scoreSum = 0;
        double avg;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.println("请输入第"+i+"个班的成绩");
            scoreSum = 0;avg = 0.0;
            for(int j=1;j<=4;j++){
                System.out.print("请输入第"+j+"个学生的成绩:");
                score= sc.nextInt();
                if(score>=85)
                    peopleSum++;
                scoreSum+=score;
            }
            avg = (double) scoreSum/4;
            System.out.println("第"+i+"个班的平均分为"+avg);
            System.out.println();
        }
        System.out.println("成绩85分以上的学员有"+peopleSum+"人");
    }
}
