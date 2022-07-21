import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("请输入跑步成绩");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        if(score<10){
            System.out.println("晋级成功");
            System.out.println("性别？");
            String sex = sc.next();
            if("男".equals(sex)){
                System.out.println("进入男子组");
            }else
                System.out.println("进入女子组");
        }else{
            System.out.println("明年再来");
        }
    }
}
