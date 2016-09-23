package ua.epam;

/**
 * Created by Iryna_Poliakova on 9/23/2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Введите целое число в диапазоне: ";
    public static final String WRONG_INPUT_TYPE = "Введенный вами тип данных не действителен! Повторите ввод ";
    public static final String ENTERED_DATA_SHOULD_BE_LESS_THAN_100 = "Введенное число должно быть меньше 100";
    public static final String ENTERED_DATA_SHOULD_BE_MORE_THAN_0 = "Введенное число должно быть больше 0";
    public static final String OUR_INT = "Вы угадали! Поздравляем! Загаданное число = ";

    public static void printMessage(String message){
        System.out.println(message);
    }

    public static void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }
}
