package ua.epam.FacadePattern;

/**
 * Created by irinapoliakova on 25.09.16.
 */
public class HDD {
    void copyFromDVD(DVDrom dvd){
        if (dvd.hasData()){
            System.out.println("Происходит копирование данных с диска");
        }
        else {
            System.out.println("Вставтье диск с данными");
        }
    }
}
