package ua.epam;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ua.epam.Entity.*;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by irinapoliakova on 26.09.16.
 */
public class Task10Test {
    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Test
    public void creatRouteWithCorrectData() throws Exception {
        Human john = new Human("John" , new Date() , Human.Gender.MALE , Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john ,new DriverLicense(new Date(40,03,10) ,
                DriverLicense.Category.C , new Date(70,03,10)));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500" , DriverLicense.Category.C ,
                1499 , 80 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
        System.out.println(route);
    }

    @Test
    public void creatRouteWithLicenseIncompatibility() throws Exception {
        Human john = new Human("John" , new Date() , Human.Gender.MALE , Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john ,new DriverLicense(new Date(40,03,10) ,
                DriverLicense.Category.B , new Date(70,03,10)));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500" , DriverLicense.Category.C ,
                1499 , 80 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
        System.out.println(route);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void creatLisenceNullHuman() throws Exception {
        exp.expect(IllegalArgumentException.class);
        Human john = new Human("John" , new Date() , Human.Gender.MALE , Human.BloodGroup.FIRST);
        Driver johnDriver = null;
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500" , DriverLicense.Category.C ,
                1499 , 80 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
        System.out.println(route);
    }

    @Test
    public void checkDateExpiresEarlierFrom() throws Exception {
        Human john = new Human("John" , new Date() , Human.Gender.MALE , Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john ,new DriverLicense(new Date(70,03,10) ,
                DriverLicense.Category.B , new Date(40,03,10)));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500" , DriverLicense.Category.C ,
                1499 , 80 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
        System.out.println(route);
    }


}