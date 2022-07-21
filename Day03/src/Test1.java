import org.junit.Test;

import java.util.Scanner;

public class Test1 {
    @Test
    public void Demo1(){
        int i=0;
        while(i<=100)
        {
            if(i%2==0)
                System.out.print(i+" ");
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        for(int i=0;i<=num;i++){
            System.out.println(i+"+"+(num-i)+"="+num);
        }
    }


}
