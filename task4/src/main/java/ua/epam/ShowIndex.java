package ua.epam;

import java.util.Arrays;

/**
 * Created by Iryna_Poliakova on 9/23/2016.
 */
public class ShowIndex {

    public static int[] displayIndex(int[] array, int number) {
        if (array == null){
            throw new IllegalArgumentException("Array can not have null");
        }
        int lenghtNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                lenghtNewArray++;
            }
        }
        int[] newArray = new int[lenghtNewArray];
        int count = 0;
        while (count < newArray.length){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    newArray[count] = i;
                    count++;
                }
            }
        }
        return newArray;
    }
}
