package cn.banyuan.chap2;

import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 3){
            System.out.println("0, 1, 1");
        }else{
            System.out.print("0, 1, 1");
            int i = 1;
            int j = 1;
            int k = 0;
            for(int m = 4; m<=n; m++){
                k = i + j;
                i = j;
                j = k;
                System.out.print(", " + k);
            }
        }
    }
}
