import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        int[] price=new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入4家店的价格");
        for(int i=0;i<4;i++){
            System.out.print("第"+(i+1)+"家店的价格:");
            price[i] = sc.nextInt();
        }
        Arrays.sort(price);
        System.out.println("最低价格是"+price[0]);
    }
}
