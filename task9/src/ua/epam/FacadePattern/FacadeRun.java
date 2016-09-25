package ua.epam.FacadePattern;

/**
 * Created by irinapoliakova on 25.09.16.
 */
public class FacadeRun {
    public static void main(String[] args) {
        // write your code here
//        Power power = new Power();
//        power.on();
//        DVDrom dvd = new DVDrom();
//        dvd.load();
//        HDD hdd = new HDD();
//        hdd.copyFromDVD(dvd);

        ComputerFacadeClass comp = new ComputerFacadeClass();
        comp.copy();

    }
}
