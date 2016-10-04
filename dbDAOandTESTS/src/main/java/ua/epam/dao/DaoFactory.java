package ua.epam.dao;

import ua.epam.entities.Author;

/**
 * Created by Iryna_Poliakova on 10/4/2016.
 */
public abstract class DaoFactory {

    public abstract AuthorDao createAuthorDao();
    public abstract EmployeeDao createEmployeeDao();
    public abstract EraDao createEraDao();
    public abstract ExcursionDao createExcursionDao();
    public abstract ExhibitDao createExhibitDao();
    public abstract HallDao createHallDao();
    public abstract VisitorDao createVisitorDao();

    public static DaoFactory getInstance(){
        String factoryClassName = "ua.epam.dao.jdbc.mysql.MySqlJdbcDaoFactory";
        try {
            return (DaoFactory) Class.forName(factoryClassName)
                    .newInstance();
        } catch (Exception e) {
            //log
            throw new RuntimeException(e);
        }
    }

}
