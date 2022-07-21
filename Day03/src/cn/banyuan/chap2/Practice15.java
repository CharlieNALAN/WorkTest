package cn.banyuan.chap2;

public class Practice15 {
    public static void main(String[] args) {
        double pi=0;
        int sum=0,i=1,flag=1;
        while(!(pi>3.1415926&&pi<3.1415927)){
            pi+=(double)flag*4/i;
            i+=2;sum++;flag=flag*-1;
        }
        System.out.println(sum);
    }
}
