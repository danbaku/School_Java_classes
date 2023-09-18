package testmp;

import java.util.Arrays;

public class mp {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 6, 2, 7, 9, 0, 1};
        int flag = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    flag = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = flag;
                }
            }
        }
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
        System.out.println(Arrays.toString(arr1));
    }
}
