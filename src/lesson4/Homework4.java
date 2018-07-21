package lesson4;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        int arr2d[][] = {{1,2},{1, 2, 3},{5},{1,2,3,4}};
        int arr1d[] = linearize(arr2d);
        System.out.println(Arrays.toString(arr1d));
    }

    private static int[] linearize(int arr[][]) {
        int reslength = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                reslength++;
            }
        }
        int res[] = new int[reslength];

        int k = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                res[k++] = arr[i][j];
            }
        }

        return res;
    }
}
