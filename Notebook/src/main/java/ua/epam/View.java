package ua.epam;

/**
 * Created by Iryna_Poliakova on 9/22/2016.
 */
public class View {
    public static final String INPUT_SURNAME = "Введите фамилию";
    public static final String INPUT_NAME = "Введите имя";
    public static final String INPUT_PATRONIMIC = "Введите отчество";
    public static final String INPUT_LOGIN = "Введите никнейм";
    public static final String INPUT_COMMENT = "Введите комментарий";
    public static final String INPUT_GROUP = "Введите группу (HOME, WORK, FRIENDS, UNIVERSITY):";
    public static final String INPUT_HOME_PHONE = "Введите номер домашнего телефона в формате ХХХ-ХХ-ХХ";
    public static final String INPUT_MOBILE_PHONE = "Введите номер мобильного телефона в формате 0ХХ-ХХХ-ХХ-ХХ";
    public static final String INPUT_EMAIL = "Введите email";
    public static final String INPUT_SKYPE = "Введите skype";
    public static final String INPUT_INDEX = "Введите индекс";
    public static final String INPUT_CITY = "Введите город";
    public static final String INPUT_STREET = "Введите улицу";
    public static final String INPUT_HOUSE = "Введите номер дома";
    public static final String INPUT_FLAT = "Введите номер квартиры ";
    public static final String INPUT_REGISTRATION_DATE = "Введите дату регистрации";
    public static final String INPUT_LAST_CHANGE_DATE = "Введите дату последнего изменения";
    public static final String WRONG_INPUT = "Неправильный ввод ";

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printMessage(String message1, String message2){
        System.out.println(message1 + message2);
    }
}
