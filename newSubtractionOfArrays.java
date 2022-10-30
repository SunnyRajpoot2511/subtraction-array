
// import java.io.*;
import java.util.*;

public class pr {

    public static int firstIndex(int[] arr, int data) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data) {
                if (mid - 1 >= 0 && arr[mid - 1] == data)
                    ei = mid - 1;
                else
                    return mid;
            } else if (data < arr[mid]) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return -1;
    }

    public static int lastIndex(int[] arr, int data) {
        int n = arr.length;
        int si = 0;
        int ei = n - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data) {
                if (mid + 1 < n && arr[mid + 1] == data)
                    si = mid + 1;
                else
                    return mid;
            } else if (data < arr[mid]) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return -1;
    }

    public static void fistIndexAndLastIndex(int[] arr, int data) {
        int fi = firstIndex(arr, data);
        if (fi == -1) {
            System.out.println("not found");
            return;
        }
        int li = lastIndex(arr, data);
        System.out.println(fi);
        System.out.println(li);
    }

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int data = sc.nextInt();

        fistIndexAndLastIndex(arr, data);

    }
}
