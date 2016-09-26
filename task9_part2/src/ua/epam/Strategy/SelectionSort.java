package ua.epam.Strategy;

import java.util.Arrays;

/**
 * Created by Iryna_Poliakova on 9/26/2016.
 */
public class SelectionSort implements Sorting{
    public void sort(int[] arr) {
        System.out.println("Сортировка выборками");
        System.out.println("до:\t" + Arrays.toString(arr));
        for (int barier = 0; barier < arr.length - 1; barier++) {
            for (int i = barier + 1; i < arr.length; i++) {
                if (arr[i] < arr[barier]) {
                    int tmp = arr[i];
                    arr[i] = arr[barier];
                    arr[barier] = tmp;
                }

            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }
}
