package ua.epam.db;

import ua.epam.dao.AuthorDao;
import ua.epam.dao.DaoFactory;
import ua.epam.entities.Author;
import ua.epam.services.AuthorServices;

import java.util.List;

public class App {

    public static void main(String[] args) {

        //работает findById
//        DaoFactory factory = DaoFactory.getInstance();
//        AuthorDao authorDao1 = factory.createAuthorDao();
//        System.out.println(authorDao1.findById(3));

        //работает findAll
//        DaoFactory factory2 = DaoFactory.getInstance();
//        AuthorDao authorDao = factory2.createAuthorDao();
//        List<Author> authors1 = authorDao.findAll();
//        for (Author a : authors1){
//            System.out.println(a);
//        }

        /* работает insert
        Author author = new Author(null, "iiiiii", 2000, 2200);
        authorDao.insert(author);
        */

        //проверка после вставки нового(insert) - не работает!
//        DaoFactory factory5 = DaoFactory.getInstance();
//        AuthorDao authorDao5 = factory5.createAuthorDao();
//        List<Author> authors5 = authorDao5.findAll();
//        for (Author a5 : authors5){
//            System.out.println(a5);
//        }

            //работает update
        DaoFactory factory3 = DaoFactory.getInstance();
        AuthorDao authorDao3 = factory3.createAuthorDao();
        //System.out.println(authorDao3.findById(23));
//        Author author3 = new Author((long) 17, "TEST", 18, 20);
//        authorDao3.update(author3);
//        System.out.println(authorDao3.findById(17));
        //authorDao3.delete(23);

        //работает findByName
//        DaoFactory factory4 = DaoFactory.getInstance();
//        AuthorDao authorDao4 = factory4.createAuthorDao();
//        System.out.println(authorDao4.findByName("name"));


        AuthorServices age = AuthorServices.getInstance();
        System.out.println(age.getAuthorAge(5));



    }
}
