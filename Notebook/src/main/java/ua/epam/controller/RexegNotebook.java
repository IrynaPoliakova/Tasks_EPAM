package ua.epam.controller;

/**
 * Created by Iryna_Poliakova on 9/22/2016.
 */
public interface RexegNotebook {
    public static final String FOR_NAMES = "[A-Za-z0-9-]{1,20}";
    public static final String COMMENT = "[A-Za-z0-9-]+";
    public static final String GROUP = "((HOME)|(WORK)|(FRIENDS)|(UNIVERSITY))";
    public static final String NOME_PHONE = "\\d{3}-\\d\\d-\\d\\d";
    public static final String MOBILE_PHONE = "\\d{3}-\\d{3}-\\d{2}-\\d{2}";
    public static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static final String SKYPE = "[_A-Za-z0-9-]+";
    public static final String INDEX = "[0-9]{5}";
    public static final String CITY = "[A-Za-z-]+";
    public static final String STREET = "[A-Za-z-/]+";
    public static final String HOUSE = "[A-Za-z0-9-/]{1,5}";
    public static final String FLAT = "[0-9]{1,3}";
    public static final String DATE =  "\\d{2}.\\d{2}.\\d{4}";


}
