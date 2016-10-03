package ua.epam.dao;

import ua.epam.ConnectionFactory;
import ua.epam.entity.Exhibit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class ExhibitDao {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private Connection getConnection() throws SQLException {
        return ConnectionFactory.getInstance().getConnection();
    }


    public void add(Exhibit exhibit) {
        String query = "INSERT INTO exhibit(name, year) VALUES(?,?)";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, exhibit.getName());
            preparedStatement.setInt(2, exhibit.getYear());
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Exhibit> getAll() {
        String query = "SELECT * FROM exhibit";

        List<Exhibit> exhibits = new ArrayList<Exhibit>();

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Exhibit exhibit = new Exhibit(resultSet.getLong("id"), resultSet.getString("name"),
                        resultSet.getInt("year"));
                exhibits.add(exhibit);
            }

            preparedStatement.close();
            connection.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return exhibits;
    }
}
