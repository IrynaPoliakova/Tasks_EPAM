package ua.epam.dao;

import ua.epam.entities.Author;

import java.util.List;

/**
 * Created by Iryna_Poliakova on 10/4/2016.
 */
public interface AuthorDao extends GenericDao<Author> {

    List<Author> findByName (String name);

}
