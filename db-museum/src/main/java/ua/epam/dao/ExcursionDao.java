package ua.epam.dao;

import ua.epam.ConnectionFactory;
import ua.epam.entity.Excursion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class ExcursionDao {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private Connection getConnection() throws SQLException {
        return ConnectionFactory.getInstance().getConnection();
    }

    public void add(Excursion excursion){
        String query = "INSERT INTO excursion(name, duration, price, date) VALUES(?,?,?,?)";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,excursion.getName());
            preparedStatement.setInt(2,excursion.getDuration());
            preparedStatement.setInt(3,excursion.getPrice());
            preparedStatement.setString(4,excursion.getData());
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public List<Excursion> getAll() {
        String query = "SELECT * FROM excursion";

        List<Excursion> excursions = new ArrayList<Excursion>();

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Excursion excursion = new Excursion(resultSet.getLong("id"), resultSet.getString("name"),
                        resultSet.getInt("duration"), resultSet.getInt("price"), resultSet.getString("date"));
                excursions.add(excursion);
            }

            preparedStatement.close();
            connection.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return excursions;
    }

}
