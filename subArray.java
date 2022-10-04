import java.util.*;

public class subArray { 

    public static Scanner scn = new Scanner(System.in);

    public static int[] input2 (int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    
    public static void range (int[] arr, int si, int ei) {
        while (si <= ei) {
            System.out.println(arr[si] + " ");
            si++;
        }
    }

    public static void SubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                range(arr, i, j);
            }
        }
    }

    public static void main (String[] args) {
        int n = scn.nextInt();
        int[] arr = input2(n);
        SubArray(arr);
    }
}
