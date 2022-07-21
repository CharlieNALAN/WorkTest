import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        int[] list = new int[6];
        list[0] = 55;
        list[1] = 7;
        list[2] = 9;
        list[3] = 102;
        list[4] = 22;

        int index= list.length-1;

        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个数:");
        int n = sc.nextInt();

        for(int i=0;i< list.length;i++){
            if(n>list[i]){
                index = i;
                break;
            }
        }
        for(int i= list.length-1;i>index;i--)
            list[i] = list[i-1];


        list[index]=n;
        System.out.println("下标为"+index);
        System.out.println("值为"+n);
        System.out.println("插入后");
        System.out.println(Arrays.toString(list));
    }
}
