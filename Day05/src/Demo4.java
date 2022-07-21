import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }


//        int[] arr = {77,66,9,100,1};
        boolean flag;
        for(int i=0;i< arr.length-1;i++){
            flag = false;
            for(int j=0;j< arr.length-i-1;j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag =true;
                }
            }
            if(!flag)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
