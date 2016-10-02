package ua.epam.dao;

import ua.epam.ConnectionFactory;
import ua.epam.entity.Author;
import ua.epam.entity.Era;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class EraDao {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private Connection getConnection() throws SQLException {
        return ConnectionFactory.getInstance().getConnection();
    }


    public void add(Era era) {
        String query = "INSERT INTO era(name, century) VALUES(?,?)";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, era.getName());
            preparedStatement.setInt(2, era.getCentury());
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Era> getAll() {
        String query = "SELECT * FROM era";

        List<Era> eras = new ArrayList<Era>();

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Era era = new Era(resultSet.getLong("id"), resultSet.getString("name"),
                        resultSet.getInt("century"));
                eras.add(era);
            }

            preparedStatement.close();
            connection.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return eras;
    }


}
