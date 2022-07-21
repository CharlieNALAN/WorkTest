package cn.banyuan.chap2;

import java.util.Scanner;

public class Practice18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        int days = 0;
        year = year - 2000;
        days = year * 365 + year / 4 - year/100 + year/400 + 1;


        switch(month){
            case 1 : break;
            case 2: days += 31; break;
            case 3: days += 28 + 31; break;
            case 4 : days += 31 + 28 + 31; break;
            case 5 : days += 31 + 28 + 31 + 30; break;
            case 6 : days += 31 + 28 + 31 + 30 + 31; break;
            case 7 : days += 31 + 28 + 31 + 30 + 31 + 30; break;
            case 8 : days += 31 + 28 + 31 + 30 + 31 + 30 + 31; break;
            case 9 : days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31; break;
            case 10 : days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30; break;
            case 11 : days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31; break;
            case 12 : days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30; break;
        }
        if ( ( (year % 4 == 0 && year % 100 !=0) || (year % 400 ==0) )
                && (month > 2) ){
            days += 1;
        }


        days += day;

        int result = days % 5;
        if (result == 3 || result == 4){
            System.out.println("打鱼");
        }else{
            System.out.println("筛网");
        }
    }
}
