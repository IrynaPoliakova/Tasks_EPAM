package ua.epam.dao;

import ua.epam.ConnectionFactory;
import ua.epam.entity.Visitor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class VisitorDao {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private Connection getConnection() throws SQLException {
        return ConnectionFactory.getInstance().getConnection();
    }


    public void add(Visitor visitor) {
        String query = "INSERT INTO visitor(name) VALUES(?)";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, visitor.getName());
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Visitor> getAll() {
        String query = "SELECT * FROM visitor";

        List<Visitor> visitors = new ArrayList<Visitor>();

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Visitor visitor = new Visitor(resultSet.getLong("id"), resultSet.getString("name"));
                visitors.add(visitor);
            }

            preparedStatement.close();
            connection.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return visitors;
    }
}
