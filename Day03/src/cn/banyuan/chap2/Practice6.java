package cn.banyuan.chap2;

public class Practice6 {
    public static void main(String[] args) {
        for(int i=0;i<=33;i++)
        {
            for(int j=0;j<=50;j++)
            {
                int k=100-i-j;
                if(k%3!=0)
                    continue;
                int Price=i*3+j*2+k/3;
                if(Price==100)
                    System.out.println("公鸡："+i+",母鸡："+j+",小鸡:"+k);
            }
        }
    }
}
