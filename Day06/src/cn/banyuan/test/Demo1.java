package cn.banyuan.test;


import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        String[] user = new String[6];              //存储用户名
        String[] pwd = new String[6];               //存储密码
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用DVD租赁系统");

        String[] name = new String[6];              //DVD名称
        int[] status = new int[6];                  //状态 0表示已借  1表示可借
        int[] day = new int[6];                     //借出日期
        int[] times = new int[6];                   //借出次数

        /*初始化数据*/
        name[0] = "练习时长两年半";
        status[0] = 0;
        day[0] = 5;
        times[0] = 1;
        name[1] = "偶像练习生";
        status[1] = 1;
        day[1] = 0;
        times[1] = 2;

        int type;

        boolean isLogIn = false;
        boolean isFindUser ;
        boolean isQuit = false;
        do{
            System.out.println("*********************");
            System.out.println("1.登录账户     2.注册账号");
            System.out.println("**********************");
            System.out.print("请选择：");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    isFindUser = false;
                    System.out.print("请输入账号：");
                    String curUser = sc.next();
                    System.out.print("请输入密码:");
                    String curPwd = sc.next();
                    for(int i=0;i<user.length;i++){
                        if(user[i]!=null){
                            if(user[i].equals(curUser)){
                                isFindUser =true;
                                if(pwd[i].equals(curPwd)){
                                    isLogIn = true;
                                    System.out.println("登录成功！");
                                }else{
                                    System.out.println("密码输入有误，请重新输入!");
                                }
                            }
                        }
                    }
                    if(!isFindUser)
                        System.out.println("未找到该用户，请重新输入或注册");
                    break;
                case 2:
                    System.out.print("请输入要注册的账户:");
                    String regUser = sc.next();
                    System.out.print("请输入密码");
                    String regPwd = sc.next();
                    for(int i=0;i< user.length;i++){
                        if(user[i]==null){
                            user[i]=regUser;
                            pwd[i]=regPwd;
                            break;
                        }
                    }
                    System.out.println("注册完成");
            }
        }while(!isLogIn);
//        System.out.println("Test");
        do{
            boolean isFull = true;
            boolean isFind = false;
            System.out.println("-----------------------------");
            System.out.println("1.新增DVD");
            System.out.println("2.查看DVD");
            System.out.println("3.删除DVD");
            System.out.println("4.借出DVD");
            System.out.println("5.归还DVD");
            System.out.println("6.退出DVD");
            System.out.println("-----------------------------");
            System.out.print("请选择：");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("---新增DVD---");
                    for(int i=0;i< name.length;i++){
                        if(name[i]==null){
                            isFull = false;
                            System.out.print("输入要添加的DVD名称:");
                            String curName = sc.next();
                            name[i] = curName;
                            status[i] = 1;
                            day[i] = 0;
                            times[i] = 0;
                            System.out.println("添加成功");
                            break;
                        }
                    }
                    if(isFull){
                        System.out.println("存储区已满，无法存储");
                    }
                    do{
                        System.out.print("输入0返回：");
                        type =sc.nextInt();
                    }while(type!=0);
                    break;
                case 2:
                    System.out.println("---查看DVD---");
                    System.out.println("序号\t\t名称\t\t\t借阅状态\t\t借出日期\t\t借出次数");
                    for(int i=0;i< name.length;i++){
                        if(name[i]==null)
                            break;
                        String curStatus = status[i]==0? "已借出":"可借阅";
                        String days = (status[i]==0? String.valueOf(day[i]) :" - ")+"日";
                        System.out.println((i+1)+"\t\t"+name[i]+"\t\t\t"+curStatus+"\t\t"
                                +days+"\t\t"+times[i]);
                    }
                    do{
                        System.out.print("输入0返回：");
                        type =sc.nextInt();
                    }while(type!=0);
                    break;
                case 3:
                    System.out.println("---删除DVD---");
                    System.out.print("请输入要删除的名称：");
                    String delName = sc.next();
                    for(int i=0;i< name.length;i++){
                        if(name[i]!=null && status[i]==1 && name[i].equals(delName)){
//                            0 1 2 3 4
                            isFind = true;
                            for(int j= i;j<name.length-1;j++){
                                name[j]=name[j+1];
                                status[j]=status[j+1];
                                day[j]=day[j+1];
                                times[j]= times[j+1];
                            }
                            name[name.length-1]=null;
                            status[name.length-1]=0;
                            day[name.length-1]=0;
                            times[name.length-1]=0;
                            System.out.println("删除成功");
                            break;
                        }else if(name[i]!=null && status[i]==0 && name[i].equals(delName)){
                            isFind = true;
                            System.out.println("抱歉，该DVD在借出时期，无法删除");
                            break;
                        }
                    }
                    if(!isFind){
                        System.out.println("抱歉未找到该DVD无法删除");
                    }
                    do{
                        System.out.print("输入0返回：");
                        type =sc.nextInt();
                    }while(type!=0);
                    break;
                case 4:
                    System.out.println("---借出DVD---");
                    System.out.print("请选择要借出的名称：");
                    String borName = sc.next();
                    for(int i=0;i< name.length;i++){
                        if(name[i]!=null&&name[i].equals(borName)&&status[i]==1){
                            isFind = true;
                            System.out.print("你想借多少天:");
                            int borDay = sc.nextInt();
                            while(borDay<1||borDay>31){
                                System.out.print("输入有误，请重新输入天数:");
                                borDay=sc.nextInt();
                            }
                            status[i]=0;
                            day[i]=borDay;
                            times[i]++;
                            System.out.println("借出成功!");
                            break;
                        }else if(name[i]!=null&&name[i].equals(borName)&&status[i]==0){
                            isFind = true;
                            System.out.println("抱歉，来晚了，该书已被借走了~");
                            break;
                        }
                    }
                    if(!isFind){
                        System.out.println("抱歉未找到该DVD");
                    }
                    do{
                        System.out.print("输入0返回：");
                        type =sc.nextInt();
                    }while(type!=0);
                    break;
                case 5:
                    System.out.println("---归还DVD---");
                    System.out.print("请输入要归还的名称：");
                    String backName = sc.next();
                    for(int i=0;i< name.length;i++){
                        if(name[i]!=null&&name[i].equals(backName)&&status[i]==0){
                            isFind = true;
                            System.out.print("请输入实际归还的时间");
                            int realDay = sc.nextInt();
                            while(realDay<1||realDay>31){
                                System.out.print("输入有误，重新输入:");
                                realDay = sc.nextInt();
                            }
                            int rent = realDay * 3;
                            System.out.println("租金为"+rent+",感谢租借！");
                            status[i]=1;
                            day[i]=0;
                            break;
                        }else if(name[i]!=null&&name[i].equals(backName)&&status[i]==1){
                            isFind = true;
                            System.out.println("这DVD压根没借出去你拿头还呢？");
                            break;
                        }
                    }
                    if(!isFind){
                        System.out.println("抱歉，没找到这个DVD信息");
                    }
                    do{
                        System.out.print("输入0返回：");
                        type =sc.nextInt();
                    }while(type!=0);
                    break;
                case 6:
                    System.out.println("---退出DVD---");
                    isQuit = true;
                    break;
                default:
                    isQuit = true;
                    break;
            }
        }while(!isQuit);
        System.out.println("程序结束，感谢使用本系统!");

    }
}
