package ua.epam;

import org.junit.Test;
import ua.epam.Entity.*;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by irinapoliakova on 26.09.16.
 */
public class MainTest {
    @Test
    public void creatRouteWithCorrectData() throws Exception {
        Human john = new Human("John" , new Date() , Human.Gender.MALE , Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john ,new DriverLicense(new Date() ,
                DriverLicense.Category.C , new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500" , DriverLicense.Category.C ,
                1499 , 80 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
        System.out.println(route);
    }

    @Test
    public void creatRouteWithLicenseIncompatibility() throws Exception {
        Human john = new Human("John" , new Date() , Human.Gender.MALE , Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john ,new DriverLicense(new Date() ,
                DriverLicense.Category.B , new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500" , DriverLicense.Category.C ,
                1499 , 80 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
        System.out.println(route);
    }

    @Test
    public void creatRouteNullHuman() throws Exception {
        Human john = null;
        Driver johnDriver = new Driver(john ,new DriverLicense(new Date() ,
                DriverLicense.Category.B , new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500" , DriverLicense.Category.C ,
                1499 , 80 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
        System.out.println(route);
    }

}