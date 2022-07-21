import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num ={8,4,2,1,23,344,12};
        int sum = 0;
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
            sum+=num[i];
        }
        System.out.println();
        System.out.println(sum);
        int choice = sc.nextInt();
        boolean flag =false;
        for(int i=0;i<num.length;i++){
            if(choice==num[i]){
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("不在");
        }else{
            System.out.println("在");
        }
    }


}
