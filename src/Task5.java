import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        /*Fill an array of 10 elements with random numbers from -10
to +10. Calculate the number of duplicate values. Output only
duplicate items and the number of repetitions to the console.
Example:
0 – 5 times
2 – 3 times
7 – 1 time*/
        int n = 10;
        int [] arr= new int[n];
        Random random= new Random();
        for (int i = 0; i < n; i++) {

            arr [i] = random.nextInt(21 )-10;

        }
        System.out.println(Arrays.toString(arr));
        int count=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j])
                    count++;  }
            if (count >0){
                System.out.println(arr[i]+" - "+ count+ (count>1 ?" times":" time") );
                count=0;}





        }
    }
}
