package cn.banyuan.chap2;

public class Practice7 {
    public static void main(String[] args) {
        for(int i=0;i<=9;i++)
        {
            for(int j=0;j<=12;j++)
            {
                int k=36-i-j;
                if(k%2!=0)
                    continue;
                int brick = i*4+j*3+k/2;
                if(brick==36)
                    System.out.println("男的："+i+",女的:"+j+",小孩:"+k);
            }
        }
    }
}
