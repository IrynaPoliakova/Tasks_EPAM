package ua.epam.Strategy;

import java.util.Arrays;

/**
 * Created by Iryna_Poliakova on 9/26/2016.
 */
public class BubbleSort implements Sorting{
    public void sort(int[] arr) {
        System.out.println("Сортировка пузырьком");
        System.out.println("до:\t" + Arrays.toString(arr));
        for (int barier = arr.length - 1; barier > 0; barier--) {
            for (int i = 0; i < barier; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }

            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }
}
