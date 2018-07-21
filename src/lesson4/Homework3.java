package lesson4;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {5, 6, 7};
        int res[] = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        do {
            if (i < arr1.length) {
                res[j] = arr1[i];
                j++;
            }
            if (i < arr2.length) {
                res[j] = arr2[i];
                j++;
            }
            i++;
        } while (i < arr1.length || i < arr2.length);

        System.out.println(Arrays.toString(res));
    }
}
