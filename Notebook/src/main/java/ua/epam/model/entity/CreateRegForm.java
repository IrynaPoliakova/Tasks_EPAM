package ua.epam.model.entity;

/**
 * Created by Iryna_Poliakova on 9/22/2016.
 */
public class CreateRegForm {
    private String abonentSurname;
    private String abonentName;
    private String abonentPatronymic; //отчества
    private String login;
    private String comment;
    private String group;
    private String homeTelephone;
    private String mobileNumber1;
    private String mobileNumber2;
    private String email;
    private String skype;
    private String index;
    private String city;
    private String street;
    private String homeNumber;
    private String flatNumber;
    private String dateOfRegistration;
    private String dateOfLastChange;


    public CreateRegForm(String abonentSurname, String abonentName,String abonentPatronymic,String login,
                         String group, String comment,String homeTelephone,String mobileNumber1, String mobileNumber2,
                         String email,String skype,String index,String city,String street,String homeNumber,
                         String flatNumber,String dateOfRegistration,String dateOfLastChange){
        this.abonentSurname = abonentSurname;
        this.abonentName = abonentName;
        this.abonentPatronymic = abonentPatronymic;
        this.login = login;
        this.comment = comment;
        this.group = group;
        this.homeTelephone = homeTelephone;
        this.mobileNumber1 = mobileNumber1;
        this.mobileNumber2 = mobileNumber2;
        this.email = email;
        this.skype = skype;
        this.index = index;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfLastChange = dateOfLastChange;

    }

    @Override
    public String toString() {
        return "Контакт!" + '\n' +
                "Фамилия:" + abonentSurname + '\n' +
                "Имя:" + abonentName + '\n' +
                "Отчество:" + abonentPatronymic + '\n' +
                "Никнейм:" + login + '\n' +
                "Комментарий:" + comment + '\n' +
                "Группа:" + group + '\n' +
                "Домашний телефон:" + homeTelephone + '\n' +
                "Мобильный телефон:" + mobileNumber1 + '\n' +
                "Мобильный телефон 2:" + mobileNumber2 + '\n' +
                "Email:" + email + '\n' +
                "Skype:" + skype + '\n' +
                "Индекс:" + index + '\n' +
                "Город:" + city + '\n' +
                "Улица:" + street + '\n' +
                "Дом:" + homeNumber + '\n' +
                "Квартира:" + flatNumber + '\n' +
                "Дата регистрации:'" + dateOfRegistration + '\n' +
                "Дата последних изменений:" + dateOfLastChange + '\n' +
                '}';
    }
}
