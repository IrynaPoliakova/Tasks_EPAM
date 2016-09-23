package ua.epam;

import java.util.Random;

/**
 * Created by Iryna_Poliakova on 9/23/2016.
 */
public class Model {

    private int min;
    private int max;
    private int value;

//    public static int rand(int min, int max) {
//        // Инициализируем генератор
//        Random rnd = new Random(System.currentTimeMillis());
//        //Получаем случайное число в диапазоне от min до max (включительно)
//        int number = min + rnd.nextInt(max - min + 1);
//        return number;
//    }

    public static int rand() {
        int MIN = 1;
        int RAND_MAX = 99;
        // Инициализируем генератор
        Random rnd = new Random(System.currentTimeMillis());
        //Получаем случайное число в диапазоне от min до max (включительно)
        int number = MIN + rnd.nextInt(RAND_MAX - MIN + 1);
        return number;
    }
}
