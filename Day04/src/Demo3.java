import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10};
        int[] arr3={3,1,22,555,332};
        Arrays.sort(arr3);
        int index = Arrays.binarySearch(arr3,22);
        System.out.println(index);
        System.out.println(Arrays.equals(arr1,arr2));

    }
}
