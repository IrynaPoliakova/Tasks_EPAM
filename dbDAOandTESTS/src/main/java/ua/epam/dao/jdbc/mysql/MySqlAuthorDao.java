package ua.epam.dao.jdbc.mysql;

import ua.epam.dao.AuthorDao;
import ua.epam.entities.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

/**
 * Created by Iryna_Poliakova on 10/4/2016.
 */
public class MySqlAuthorDao implements AuthorDao {

    private static final String SELECT_ALL_AUTHORS = "SELECT * FROM author";
    private static final String SELECT_AUTHOR_BY_NAME = "SELECT * FROM author WHERE name = ?";
    private static final String SELECT_AUTHOR_BY_ID = "SELECT * FROM author WHERE id = ?";
    private static final String INSERT_AUTHOR ="INSERT INTO author(name, bith_date, death_date) VALUES(?,?,?)";
    private static final String UPDATE_AUTHOR_BY_ID ="UPDATE author SET name = ?, bith_date = ?, death_date = ? WHERE id = ?";
    private static final String DELETE_AUTHOR_BY_ID = "DELETE FROM author WHERE id = ?";

    @Override
    public Author findById( int id) {
            Author author = new Author();
            Connection connection =  MySqlJdbcDaoFactory.getConnection();
            try(PreparedStatement query = connection
                    .prepareStatement(SELECT_AUTHOR_BY_ID)){
                query.setInt(1, id);
                ResultSet rs = query.executeQuery();
                while( rs.next() ) {
                    author = getAuthorsFromResultSet(rs);
                }
            }catch(Exception ex){
                //log
                throw new RuntimeException(ex);
            }
            return author;
    }

    @Override
    public List<Author> findAll() {
        List<Author> result = new ArrayList<>();
        try{
            Connection connection =  MySqlJdbcDaoFactory.getConnection();
            Statement query = connection.createStatement();
            ResultSet rs = query.executeQuery(SELECT_ALL_AUTHORS);
            while( rs.next() ){
                result.add(getAuthorsFromResultSet(rs));
            }
        }catch(Exception ex){
            //log
            throw new RuntimeException(ex);
        }
        return result;
    }

    private Author getAuthorsFromResultSet(ResultSet resultSet)
            throws SQLException {
        Author authors = new Author();
        authors.setId(resultSet.getLong("id"));
        authors.setName(resultSet.getString("name"));
        authors.setBirthDate(resultSet.getInt("bith_date"));
        authors.setDeathDate(resultSet.getInt("death_date"));
        return authors;
    }

    @Override
    public void update(Author entity) {
        try{
            Connection connection =  MySqlJdbcDaoFactory.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_AUTHOR_BY_ID);
            preparedStatement.setLong(1, entity.getId());
            preparedStatement.executeUpdate();
        }catch(Exception ex){
            //log
            throw new RuntimeException(ex);
        }
    }



    @Override
    public void delete(int id) {
        try{
            Connection connection =  MySqlJdbcDaoFactory.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_AUTHOR_BY_ID);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        }catch(Exception ex){
            //log
            throw new RuntimeException(ex);
        }

    }

    @Override
    public void insert(Author entity) {
            try {
                Connection connection =  MySqlJdbcDaoFactory.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_AUTHOR);
                preparedStatement.setString(1, entity.getName());
                preparedStatement.setInt(2, entity.getBirthDate());
                preparedStatement.setInt(3, entity.getDeathDate());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    @Override
    public List<Author> findByName(String name) {
        List<Author> result = new ArrayList<>();
        Connection connection =  MySqlJdbcDaoFactory.getConnection();
        try(PreparedStatement query = connection
                .prepareStatement(SELECT_AUTHOR_BY_NAME)){
            query.setString(1, name);
            ResultSet rs = query.executeQuery();
            while( rs.next() ){
                Author authors = getAuthorsFromResultSet(rs);
                result.add(authors);
            }
        }catch(Exception ex){
            //log
            throw new RuntimeException(ex);
        }
        return result;
    }

}
