import java.util.*;

public class query {

    public static Scanner scn = new Scanner (System.in);

    public static int[]  input2 (int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void queries(long n, int[] arr) {
        int[] freq = new int[10];
        while (n != 0) {
            long d = n % 10;
            n = n / 10;

            freq[(int) d]++;
        }
        for (int q : arr  ) {
            System.out.println(freq[q]);
        }
    }

    public static void main (String[] args) {
        long n = scn.nextLong();
        int[] arr = input2(scn.nextInt());
        queries(n, arr);
    }
}
