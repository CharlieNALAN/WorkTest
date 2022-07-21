public class Demo2 {
    public static void main(String[] args) {
        int[] num={9,3,4,66,73,158,44,2,13,444,6};
        int min=num[0],max=num[0];
        for(int i=1;i<num.length;i++)
        {
            min= Math.min(min, num[i]);
            max= Math.max(max, num[i]);
        }
        System.out.println(max);
        System.out.println(min);
    }
}
