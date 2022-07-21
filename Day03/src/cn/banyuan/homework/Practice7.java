package cn.banyuan.homework;

public class Practice7 {
    public static void main(String[] args) {
        int sum =0;
        for(int i=1;i<=10;i++){
            sum+=i;
            if(sum>20)
                System.out.print(i+" ");
        }
    }
}
