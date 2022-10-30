import java.util.*;

public class fullDiagonal {

    public static Scanner scn = new Scanner(System.in);

    public static void input (int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void diagonals(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int gap = n - 1; gap >= 1; gap--) {
            for (int i = gap, j = 0; i < n && j < m; i++, j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int gap = 0; gap < m; gap++) {
            for (int i = 0, j = gap; i < n && j < m; i++, j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }    

    public static void main (String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        diagonals(arr);
    }
}
