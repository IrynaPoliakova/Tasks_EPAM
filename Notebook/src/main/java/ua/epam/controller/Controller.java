package ua.epam.controller;
import ua.epam.model.Model;
import ua.epam.View;
import ua.epam.model.entity.CreateRegForm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ua.epam.View.WRONG_INPUT;

/**
 * Created by Iryna_Poliakova on 9/22/2016.
 */
public class Controller implements RexegNotebook {
    Model model;
    View  view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputRegForm inputRegForm = new InputRegForm();

        inputRegForm.setAbonentSurname(checkInput(FOR_NAMES, sc, view.INPUT_SURNAME));
                inputRegForm.setAbonentName(checkInput(FOR_NAMES,sc,view.INPUT_NAME));
                inputRegForm.setAbonentPatronymic(checkInput(FOR_NAMES,sc,view.INPUT_PATRONIMIC));
                inputRegForm.setLogin(checkInput(FOR_NAMES,sc,view.INPUT_LOGIN));
                inputRegForm.setComment(checkInput(COMMENT,sc,view.INPUT_COMMENT));
                inputRegForm.setGroup(checkInput(GROUP,sc,view.INPUT_GROUP));
                inputRegForm.setHomeTelephone(checkInput(NOME_PHONE,sc,view.INPUT_HOME_PHONE));
                inputRegForm.setMobileNumber1(checkInput(MOBILE_PHONE,sc,view.INPUT_MOBILE_PHONE));
                inputRegForm.setMobileNumber2(checkInput(MOBILE_PHONE,sc,view.INPUT_MOBILE_PHONE));
                inputRegForm.setEmail(checkInput(EMAIL ,sc,view.INPUT_EMAIL));
                inputRegForm.setSkype(checkInput(SKYPE,sc,view.INPUT_SKYPE));
                inputRegForm.setIndex(checkInput(INDEX ,sc,view.INPUT_INDEX));
                inputRegForm.setCity(checkInput(CITY ,sc,view.INPUT_CITY));
                inputRegForm.setStreet(checkInput(STREET,sc,view.INPUT_STREET));
                inputRegForm.setHomeNumber(checkInput(HOUSE,sc,view.INPUT_HOUSE));
                inputRegForm.setFlatNumber(checkInput(FLAT,sc,view.INPUT_FLAT));
                inputRegForm.setDateOfRegistration(checkInput(DATE,sc,view.INPUT_REGISTRATION_DATE));
                inputRegForm.setDateOfRegistration(checkInput(DATE,sc,view.INPUT_LAST_CHANGE_DATE));

        System.out.println((model.createContact(
                inputRegForm.getAbonentSurname(),
                inputRegForm.getAbonentName(),
                inputRegForm.getAbonentPatronymic(),
                inputRegForm.getLogin(),
                inputRegForm.getComment(),
                inputRegForm.getGroup(),
                inputRegForm.getHomeTelephone(),
                inputRegForm.getMobileNumber1(),
                inputRegForm.getMobileNumber2(),
                inputRegForm.getEmail(),
                inputRegForm.getSkype(),
                inputRegForm.getIndex(),
                inputRegForm.getCity(),
                inputRegForm.getStreet(),
                inputRegForm.getHomeNumber(),
                inputRegForm.getFlatNumber(),
                inputRegForm.getDateOfRegistration(),
                inputRegForm.getDateOfRegistration() )).toString());
    }

    public static String checkInput(String regex, Scanner sc, String message) {
        View view = new View();
        String test = "";
        while (true) {
            view.printMessage(message);
            test = sc.nextLine();
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(test);
            if (!m.matches()) {
                view.printMessage(view.WRONG_INPUT);
                continue;
            }
            break;

        }
        return test;
    }



}
