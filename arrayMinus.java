import java.util.*;

public class diffArray {

    public static Scanner scn = new Scanner(System.in);

    public static int[] input2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    // arr1 > arr2
    public static void subtract(int[] arr2, int[] arr1) {
        int a = arr2.length;
        int b = arr1.length;
        int[] ans = new int[a];

        int i = a - 1, j = b - 1, k = a - 1, borrow = 0;

        while (k >= 0) {
            int diff = borrow + arr2[i] - (j >= 0 ? arr1[j] : 0);
            if (diff < 0) {
                borrow = -1;
                diff = diff + 10;
            } else {
                borrow = 0;
            }

            ans[k] = diff;

            i--;
            j--;
            k--;
        }
        boolean isZero = false;
        for (int ele : ans) {
            if (ele != 0) {
                isZero = true;
            }
            if (isZero) {
                System.out.println(ele);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = input2(scn.nextInt());
        int[] arr2 = input2(scn.nextInt());
        subtract(arr2, arr1);
    }
}
