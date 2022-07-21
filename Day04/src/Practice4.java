import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        //声明一个长度为6的数组
        int[] list =new int[6];
        list[0]=12;
        list[1]=7;
        list[2]=9;
        list[3]=102;
        list[4]=22;
        //留一个空位置给新插入的值
        //新插入得值假设下标为  最后一个空位置
        int index=list.length-1;

        /*
          2.提示用户输入值
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int n=sc.nextInt();

        /*
         * 3.遍历原有数组所有值，然后判断 新值有没有大于原值
         * 如果有  将原来的值得下标赋值给  index     然后break;  后面
         * 的内容不用再看
         * */
        for(int i=0;i<list.length;i++){
            //判断输入的值   n  是否有大于list[i]
            if(n>list[i]){
                index=i;
                break;
            }
        }


        /*
         *
         * 4.移动数据的位置  从最后一个数据开始逐步向后移动一个
         * 直到移动到index  为止
         * */

        for(int i=list.length-1;i>index;i--){
            list[i]=list[i-1];
        }


        /*
         *
         * 5.将输入的值给index  最后遍历数组
         * */
        list[index]=n;
        System.out.println("下标是："+index);
        System.out.println("值是："+n);
        System.out.println("插入后的值是：");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
}
