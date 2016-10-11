package ua.epam.services;

import ua.epam.dao.AuthorDao;
import ua.epam.dao.DaoFactory;
import ua.epam.entities.Author;

import java.util.List;

/**
 * Created by Iryna_Poliakova on 10/11/2016.
 */
public class AuthorServices {
    private static AuthorServices instance;

    private AuthorDao dao = DaoFactory.getInstance().createAuthorDao();

    AuthorServices() { super(); }

    void setDao(AuthorDao dao) { this.dao = dao; }

    public static AuthorServices getInstance(){
        if( instance == null ){
            instance = new AuthorServices();
        }
        return instance;
    }

    public int getAuthorAge(int id){
        Author author = dao.findById(id);
        return author.getDeathDate() - author.getBirthDate();
    }
}
