package ua.epam;

import ua.epam.dao.*;
import ua.epam.entity.*;

import java.util.List;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class Main {

    public static void main(String[] args) {

//        AuthorDao authorDao = new AuthorDao();
//        Author author = new Author(null, "name", 11, 11);
//        System.out.println("Start : ");
//        List<Author> allAuthors = authorDao.getAll();
//        for (Author a : allAuthors) {
//            System.out.println(a);
//        }
//        authorDao.add(author);
//        System.out.println("\n" + "After add  : ");
//        allAuthors = authorDao.getAll();
//        for (Author a : allAuthors) {
//            System.out.println(a);
//        }


//        EmployeeDao employeeDao = new EmployeeDao();
//        Employee employee = new Employee(null, "Paris Hilton", "guide", 50);
//        System.out.println("Start : ");
//        List<Employee> allEmployees = employeeDao.getAll();
//        for (Employee e : allEmployees){
//            System.out.println(e);
//        }
//        employeeDao.add(employee);
//        System.out.println("\n" + "After add  : ");
//        allEmployees = employeeDao.getAll();
//        for (Employee e : allEmployees){
//            System.out.println(e);
//        }

//        EraDao eraDao = new EraDao();
//        Era era = new Era(null, "Modernizm", 21);
//        System.out.println("Show data from table Era");
//        List<Era> allEras = eraDao.getAll();
//        for (Era era1 : allEras){
//            System.out.println(era1);
//        }
//        eraDao.add(era);
//        System.out.println("\n" + "After add  : ");
//        allEras = eraDao.getAll();
//        for (Era era1 : allEras){
//            System.out.println(era1);
//        }


//        ExcursionDao excursionDao = new ExcursionDao();
//        Excursion excursion = new Excursion(null, "Usual", 2, 100, "2016-09-10 12:00:00" );
//        System.out.println("Show data from table Excursions");
//        List<Excursion> allExcursions = excursionDao.getAll();
//        for (Excursion exc : allExcursions){
//            System.out.println(exc);
//        }
//        allExcursions.add(excursion);
//        System.out.println("\n" + "After add  : ");
//        allExcursions = excursionDao.getAll();
//        for (Excursion exc : allExcursions){
//            System.out.println(exc);
//        }


//        ExhibitDao exhibitDao = new ExhibitDao();
//        Exhibit exhibit = new Exhibit(null, "Paint", 1900);
//        System.out.println("Show data from table Exhibits ");
//        List<Exhibit> allExhibits = exhibitDao.getAll();
//        for (Exhibit exhib : allExhibits){
//            System.out.println(exhib);
//        }
//        exhibitDao.add(exhibit);
//        System.out.println("\n" + "After add  : ");
//        allExhibits = exhibitDao.getAll();
//        for (Exhibit exhib : allExhibits){
//            System.out.println(exhib);
//        }

//        HallDao hallDao = new HallDao();
//        Hall hall = new Hall(null, "TEST");
//        System.out.println("Show data from table Halls");
//        List<Hall> allHalls = hallDao.getAll();
//        for (Hall h : allHalls){
//            System.out.println(h);
//        }
//        hallDao.add(hall);
//        System.out.println("\n" + "After add  : ");
//        allHalls = hallDao.getAll();
//        for (Hall h : allHalls){
//            System.out.println(h);
//        }

        VisitorDao visitorDao = new VisitorDao();
        Visitor visitor = new Visitor(null, "Vasia");
        System.out.println("Show data from table Visitors");
        List<Visitor> allVisitors = visitorDao.getAll();
        for (Visitor vis : allVisitors){
            System.out.println(vis);
        }
        visitorDao.add(visitor);
        System.out.println("\n" + "After add  : ");
        visitorDao.getAll();
        allVisitors = visitorDao.getAll();
        for (Visitor vis : allVisitors){
            System.out.println(vis);
        }




    }
}
