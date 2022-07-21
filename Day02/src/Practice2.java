import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入消费金额:");
        int money = sc.nextInt();
        System.out.println("是否参加优惠换购活动：");
        System.out.println("1:满50元，加2元换购百事可乐饮料1瓶");
        System.out.println("2：满100元，加3元换购500ml可乐一瓶");
        System.out.println("3：满100元，加10元换购5公斤面粉");
        System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");
        System.out.println("5：满200元，加20元可换购欧莱雅爽肤水一瓶");
        System.out.println("0：不换购");
        System.out.print("请选择:");
        int choice = sc.nextInt();
        switch(choice){
            case 0:
                break;
            case 1:
                if(money<50){
                    System.out.println("不满足换购条件");
                    break;
                }
                else{
                    money+=2;
                    System.out.println("本次消费金额:"+money);
                    System.out.println("成功换购：1瓶百事可乐饮料");
                }
                break;
            case 2:
                if(money<100){
                    System.out.println("不满足换购条件");
                    break;
                }
                else{
                    money+=3;
                    System.out.println("本次消费金额:"+money);
                    System.out.println("成功换购：500ml可乐一瓶");
                }
                break;
            case 3:
                if(money<100){
                    System.out.println("不满足换购条件");
                    break;
                }
                else{
                    money+=10;
                    System.out.println("本次消费金额:"+money);
                    System.out.println("成功换购：5公斤面粉");
                }
                break;
            case 4:
                if(money<200){
                    System.out.println("不满足换购条件");
                    break;
                }
                else{
                    money+=10;
                    System.out.println("本次消费金额:"+money);
                    System.out.println("成功换购：1个苏泊尔炒菜锅");
                }
                break;
            case 5:
                if(money<200){
                    System.out.println("不满足换购条件");
                    break;
                }
                else{
                    money+=20;
                    System.out.println("本次消费金额:"+money);
                    System.out.println("成功换购：一瓶欧莱雅爽肤水");
                }
                break;
        }
    }
}
