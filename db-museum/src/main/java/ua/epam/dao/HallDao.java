package ua.epam.dao;

import ua.epam.ConnectionFactory;
import ua.epam.entity.Hall;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class HallDao {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private Connection getConnection() throws SQLException {
        return ConnectionFactory.getInstance().getConnection();
    }


    public void add(Hall hall) {
        String query = "INSERT INTO hall(name) VALUES(?)";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, hall.getName());
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Hall> getAll() {
        String query = "SELECT * FROM hall";

        List<Hall> halls = new ArrayList<Hall>();

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Hall hall = new Hall(resultSet.getLong("id"), resultSet.getString("name"));
                halls.add(hall);
            }

            preparedStatement.close();
            connection.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return halls;
    }
}
