import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int n = 30;
        int [] arr= new int[n];
        Random random= new Random();
        for (int i = 0; i < n; i++) {

            arr [i] = random.nextInt(121 )-70;

        }
        int min=arr[0];
        int max=arr[0];
        for (int i = 1; i < n; i++) {
           if (arr[i]<min)
               min=arr[i];
           if (arr[i]>max)
               max=arr[i];

        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(Arrays.toString(arr));
    }
}