package ua.epam.model;
import ua.epam.model.entity.Contact;

/**
 * Created by Iryna_Poliakova on 9/22/2016.
 */
public class Model {


    public Contact createContact(String abonentSurname, String abonentName, String abonentPatronymic, String login,
                                 String comment, String group, String homeTelephone, String mobileNumber1,
                                 String mobileNumber2, String email, String skype, String index,
                                 String city, String street, String homeNumber, String flatNumber,
                                 String dateOfRegistration, String dateOfLastChange){

                Contact person = new Contact(abonentSurname, abonentName, abonentPatronymic, login,
                comment, group, homeTelephone, mobileNumber1, mobileNumber2, email, skype, index,
                city, street, homeNumber, flatNumber, dateOfRegistration, dateOfLastChange);
        return person;
    }

}
