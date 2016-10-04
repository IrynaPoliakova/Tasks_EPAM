package ua.epam.db;

import ua.epam.dao.AuthorDao;
import ua.epam.dao.DaoFactory;

public class App {

    public static void main(String[] args) {

        /*	DaoFactory factory = DaoFactory.getInstance();
    	GoodsDao dao = factory.createGoodsDao();
    	System.out.println(dao.findByPrice(100));
    */

        DaoFactory factory = DaoFactory.getInstance();
        AuthorDao authorDao1 = factory.createAuthorDao();
        System.out.println(authorDao1.findById(3));


    }
}
