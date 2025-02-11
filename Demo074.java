import java.util.Arrays;

public class Demo074 {
    public static void rearrangeEvenOdd(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int evenIndex = 0;
        int oddIndex = n - 1;

        // Loop through the array and arrange even and odd numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex++] = num; // Place even numbers on the left
            } else {
                result[oddIndex--] = num;  // Place odd numbers on the right
            }
        }

        // Print the rearranged array
        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }

    
