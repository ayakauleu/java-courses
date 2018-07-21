package lesson4;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 5, 3, 2};
        for (int i=1; i<arr.length; i++) {
            for (int j=0; j<i; j++) {
                if (arr[j] == arr[i]) {
                    arr[i] = 0;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
