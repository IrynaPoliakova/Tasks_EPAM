package ua.epam.dao;

import java.util.List;

public interface GenericDao<T> {
    T findById(int id);
    List<T> findAll();
    void update(int id, String name);
    void delete(int id);
    void insert(T entity);
}
