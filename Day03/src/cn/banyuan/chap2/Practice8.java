package cn.banyuan.chap2;

public class Practice8 {
    public static void main(String[] args) {
        for(int num=1000;num<10000;num++)
        {
            int d = num%10;
            int c = num/10%10;
            int b = num/100%10;
            int a = num/1000;
            if(((a*10+b)+(c*10+d))*((a*10+b)+(c*10+d))==num)
                System.out.println(num);
        }
    }
}
