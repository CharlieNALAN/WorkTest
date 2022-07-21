package cn.banyuan.project;

import java.util.Scanner;

public class eat {
    public static void main(String[] args) {
        System.out.println("欢迎使用\"吃货联盟订餐系统\"");
        Scanner sc = new Scanner(System.in);

        String[] names = new String[4];         //订餐人
        String[] dishMegs = new String[4];      //订餐份数
        int[] times =new int[4];                //时间
        String[] addresses = new String[4];       //地址
        int[] status = new int[4];              //状态： //0->完成     1->已预订
        double[] priceses = new double[4];        //价格

        names[0]="陶涛";
        dishMegs[0]="鱼香肉丝1份";
        times[0]=12;
        addresses[0]="半圆大厅";
        status[0]=0;
        priceses[0]=13;

        names[1]="张天弘";
        dishMegs[1]="西红柿炒韭菜";
        times[1]=12;
        addresses[1]="教室";
        status[1]=1;
        priceses[1]=23;


        /*菜单内容*/
        String[] dishMeg ={"苏珊树枝","篮球炒鸡","食不食油饼"};
        double[] price = {38.0,22.0,58.0};      //单价
        int[] zan = new int[4];

        int choice;
        boolean isQuit =false;
        do{
            boolean isAdd=false;  //false 餐袋满了  true  没有满
            boolean isFind=false;
            boolean isDel = false;


            System.out.println("***************************");
            System.out.println("1. 我要订餐");
            System.out.println("2. 查看餐袋");
            System.out.println("3. 签收订单");
            System.out.println("4. 删除订单");
            System.out.println("5. 我要点赞");
            System.out.println("6. 退出系统");
            System.out.println("***************************");
            System.out.print("请选择：");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("***1. 我要订餐***");
//                    System.out.print("请输入订餐人姓名");
                    for(int i=0;i< names.length;i++){
                        if(names[i]==null){
                            isAdd = true;
                            System.out.print("请输入订餐人姓名:");
                            String name = sc.next();

                            System.out.println("序号\t菜品\t单价(元)\t点赞数");
                            for(int j=0;j<dishMeg.length;j++){
                                System.out.println((j+1)+"\t"+dishMeg[j]+"\t"+price[j]+"\t"+zan[j]);
                            }

                            System.out.print("请选择菜品编号:");
                            int num = sc.nextInt();
                            String dish =dishMeg[num-1];
                            System.out.print("份数:");
                            int fen = sc.nextInt();
                            dish+=fen+"份";
                            /*计算餐费*/
                            double pri = price[num -1] * fen;
                            double p = pri > 50 ? 0 : 5;

                            System.out.println("送餐时间（10~20点）");
                            int time = sc.nextInt();
                            while(time<10||time>20){
                                System.out.println("sorry，不在送餐时间内，请重新输入");
                                time = sc.nextInt();
                            }

                            System.out.print("地址：");
                            String address=sc.next();
                            System.out.println("订餐成功*****");

                            System.out.println("您订的是："+dish);
                            System.out.println("送餐时间是："+time);
                            System.out.println("餐费是："+pri+"送餐费是："+p+"总计："+(pri+p));

                            names[i]=name;
                            dishMegs[i]=dish;
                            times[i]=time;
                            status[i]=1;
                            addresses[i]=address;
                            priceses[i]=(pri+p);
                            break;
                        }
                    }

                    if(!isAdd){
                        System.out.println("不好意思，餐袋已满");
                    }

                    do{
                        System.out.print("输入0返回:");
                        choice =sc.nextInt();
                    }while(choice!=0);
                    break;
                case 2:
                    System.out.println("***2. 查看餐袋***");
                    System.out.println("序号\t\t订餐人\t\t餐品信息\t\t送餐日期\t\t地址\t\t总金额\t\t状态");
                    for(int i=0;i< names.length;i++){
                        if(names[i]!=null){
                            String time=times[i]+"时";
                            String pri=priceses[i]+"元";
                            String statu = status[i] == 0?"已完成":"已预订";
                            System.out.println((i+1)+"\t\t"+names[i]+"\t\t"+dishMegs[i]+
                                    "\t\t"+time+"\t\t"+addresses[i]
                                    +"\t\t"+pri+"\t\t"+statu);
                        }
                    }
                    do{
                        System.out.print("输入0返回:");
                        choice =sc.nextInt();
                    }while(choice!=0);
                    break;
                case 3:
                    System.out.println("***3. 签收订单***");
                    System.out.println("请输入需要签收的订单序号");
                    int num = sc.nextInt();
                    if(num> names.length){
                        System.out.println("未找到订单");
                        do{
                            System.out.print("输入0返回:");
                            choice =sc.nextInt();
                        }while(choice!=0);
                        break;
                    }
                    if(names[num-1]!=null&&status[num-1]==1){
                        isFind = true;
                        status[num-1] = 0;
                        System.out.println("签收完成");
                    }else if(names[num-1]!=null&&status[num-1]==0){
                        isFind = true;
                        System.out.println("已经签收不可重复签收");
                    }
                    if(!isFind)
                        System.out.println("不好意思，没找到订单");

                    do{
                        System.out.print("输入0返回:");
                        choice =sc.nextInt();
                    }while(choice!=0);
                    break;
                case 4:
                    System.out.println("***4. 删除订单***");
                    System.out.print("请输入需要删除的序号：");
                    int del = sc.nextInt();

                    for (int i = 0; i < names.length; i++) {
                        if(names[i]!= null && status[i]==0 && del==i+1){
                            isDel = true;
                            for (int j = del-1; j < names.length -1 ; j++) {
                                names[j] = names[j+1];
                                dishMegs[j]=dishMegs[j+1];
                                times[j]=times[j+1];

                                addresses[j]=addresses[j+1];
                                status[j]=status[j+1];
                                priceses[j]=priceses[j+1];
                            }
                                /*挪动后最后空出来的位置补上空数据*/
                                names[names.length-1]=null;
                                dishMegs[names.length-1]=null;
                                times[names.length-1]=0;

                                addresses[names.length-1]=null;
                                status[names.length-1]=0;
                                priceses[names.length-1]=0;
                                System.out.println("删除成功~~");
//                                break;

                        }else if(names[i]!=null && status[i]==1 && del==i+1){
                            isDel = true;
                            System.out.println("订单还未完成不能删除");
                        }
                    }

                    if(!isDel){
                        System.out.println("您需要删除的订单不存在");
                    }
                    do{
                        System.out.print("输入0返回:");
                        choice =sc.nextInt();
                    }while(choice!=0);
                    break;
                case 5:
                    System.out.println("***5. 我要点赞***");
                    System.out.println("序号\t\t菜名\t\t单价\t\t点赞数");
                    for (int i = 0; i < dishMeg.length; i++) {
                        System.out.println((i+1)+"\t\t"+dishMeg[i]+"\t\t"+price[i]+"\t\t"+zan[i]);
                    }
                    System.out.println("请输入点赞的序号");
                    int zanNum = sc.nextInt();
                    zan[zanNum-1]++;
                    if(zanNum> dishMeg.length-1){
                        System.out.println("输入有误");
                        do{
                            System.out.print("输入0返回:");
                            choice =sc.nextInt();
                        }while(choice!=0);
                        break;
                    }
                    System.out.println("序号\t\t菜名\t\t单价\t\t点赞数");
                    for (int i = 0; i < dishMeg.length; i++) {
                        System.out.println((i+1)+"\t\t"+dishMeg[i]+"\t\t"+price[i]+"\t\t"+zan[i]);
                    }
                    do{
                        System.out.print("输入0返回:");
                        choice =sc.nextInt();
                    }while(choice!=0);
                    break;
                case 6:
                    System.out.println("***6. 退出系统**");
                    isQuit = true;
                    break;
            }
        }while(!isQuit);
        System.out.println("谢谢使用");
    }

}
