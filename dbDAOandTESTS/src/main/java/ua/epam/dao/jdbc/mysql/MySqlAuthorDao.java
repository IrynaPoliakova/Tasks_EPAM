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

    private static final String SELECT_ALL_AUTHORS = "SELECT * FROM goods";
    private static final String SELECT_AUTHOR_BY_NAME = "SELECT * FROM authors WHERE name = ?";
    private static final String SELECT_AUTHOR_BY_ID = "SELECT * FROM authors WHERE id = ?";
    private static final String INSERT_AUTHOR ="INSERT INTO author(name, bith_date, death_date) VALUES(?,?,?)";
    private static final String UPDATE_AUTHOR_NAME_BY_ID ="UPDATE author SET name = ? WHERE id = ?)";

    @Override
    public Author findById( int id) {
            Author author = new Author();
            Connection connection =  MySqlJdbcDaoFactory.getConnection();
            try(PreparedStatement query = connection
                    .prepareStatement(SELECT_AUTHOR_BY_ID)){
                query.setInt(1, id);
                ResultSet rs = query.executeQuery();
                author = getAuthorsFromResultSet(rs);

            }catch(Exception ex){
                //log
                throw new RuntimeException(ex);
            }
            return author;
    }

    @Override
    public List<Author> findAll() {
        List<Author> result = new ArrayList<>();
        Connection connection =  MySqlJdbcDaoFactory.getConnection();
        try(Statement query = connection.createStatement()){

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
        authors.setBirthDate(resultSet.getInt("birth_date"));
        authors.setDeathDate(resultSet.getInt("death_date"));
        return authors;
    }

    @Override
    public void update(int id, String name) {
        Connection connection =  MySqlJdbcDaoFactory.getConnection();
        try(PreparedStatement query = connection
                .prepareStatement(UPDATE_AUTHOR_NAME_BY_ID)){
            query.setInt(2, id);
            query.setString(1,name);
            ResultSet rs = query.executeQuery();

        }catch(Exception ex){
            //log
            throw new RuntimeException(ex);
        }
    }



    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void insert(Author entity) {
        PreparedStatement preparedStatement = null;
        try {
            Connection connection =  MySqlJdbcDaoFactory.getConnection();
            preparedStatement = connection.prepareStatement(INSERT_AUTHOR);
            preparedStatement.setString(1, entity.getName());
            preparedStatement.setInt(2, entity.getBirthDate());
            preparedStatement.setInt(3, entity.getDeathDate());
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
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
