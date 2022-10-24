import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        /*Fill an array of dimension n with random numbers from -2
to n. If there is at least one negative value in the array that is less
than -1, replace all negative values in the array by the square (by
the power of 2) of these values. Output the source and resultant
array to the console.*/
        int n = 10;
        int [] arr= new int[n];
        Random random= new Random();
        for (int i = 0; i < n; i++) {

            arr [i] = random.nextInt(n+3 )-2;

        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            if (arr[i]<0)
                arr[i]=arr[i]*arr[i];

        }
        System.out.println(Arrays.toString(arr));



    }
}
