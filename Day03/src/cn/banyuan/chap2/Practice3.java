package cn.banyuan.chap2;

public class Practice3 {
    public static void main(String[] args) {
        int sum = 0 , i =1;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println(sum);

        sum=0;i=1;
        while(i<=100){
            sum+=i;
            i=i+2;
        }
        System.out.println(sum);
    }
}
