package lesson4;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int l = arr.length;
        int temp = arr[l-1];
        for (int i = l-1; i > 0; i--) {
            arr[i] = arr[i-1];
        };
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
