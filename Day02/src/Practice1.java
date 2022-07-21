import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("按几？");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("打给爸爸");
                break;
            case 2:
                System.out.println("打给妈妈");
                break;
            case 3:
                System.out.println("打给爷爷");
                break;
            case 4:
                System.out.println("打给奶奶");
                break;
        }
    }
}
