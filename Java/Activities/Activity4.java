package Activities;
import java.util.Arrays;
public class Activity4 {
    public static void main(String args[]) {
        int[] arr = new int[]{2, 6, 10, 12, 1, 3, 13};
        System.out.println("The array before sort is"+Arrays.toString(arr));

        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }
        System.out.println("Thhe array after sort is" + Arrays.toString(arr));
    }
}

