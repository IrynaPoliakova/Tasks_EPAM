package ua.epam.controller;

/**
 * Created by Iryna_Poliakova on 9/22/2016.
 */
public interface RexegNotebook {
    String FOR_NAMES = "[A-Za-z0-9-]{1,20}";
    String COMMENT = "[A-Za-z0-9-]+";
    String GROUP = "((HOME)|(WORK)|(FRIENDS)|(UNIVERSITY))";
    String NOME_PHONE = "\\d{3}-\\d\\d-\\d\\d";
    String MOBILE_PHONE = "\\d{3}-\\d{3}-\\d{2}-\\d{2}";
    String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    String SKYPE = "[_A-Za-z0-9-]+";
    String INDEX = "[0-9]{5}";
    String CITY = "[A-Za-z-]+";
    String STREET = "[A-Za-z-/]+";
    String HOUSE = "[A-Za-z0-9-/]{1,5}";
    String FLAT = "[0-9]{1,3}";
    String DATE =  "\\d{2}.\\d{2}.\\d{4}";


}
