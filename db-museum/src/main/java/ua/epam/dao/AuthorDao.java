package ua.epam.dao;

import ua.epam.ConnectionFactory;
import ua.epam.entity.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class AuthorDao {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private Connection getConnection() throws SQLException {
        return ConnectionFactory.getInstance().getConnection();
    }


    public void add(Author author) {
        String query = "INSERT INTO author(name, bith_date, death_date) VALUES(?,?,?)";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, author.getName());
            preparedStatement.setInt(2, author.getBirthDate());
            preparedStatement.setInt(3, author.getDeathDate());
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Author> getAll() {
        String query = "SELECT * FROM author";

        List<Author> authors = new ArrayList<Author>();

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Author author = new Author(resultSet.getLong("id"), resultSet.getString("name"),
                        resultSet.getInt("bith_date"), resultSet.getInt("death_date"));
                authors.add(author);
            }

            preparedStatement.close();
            connection.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return authors;
    }


}
