package ua.epam.FacadePattern;

/**
 * Created by irinapoliakova on 25.09.16.
 */
public class ComputerFacadeClass {
    Power power = new Power();
    DVDrom dvd = new DVDrom();
    HDD hdd = new HDD();

    void copy(){
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}
