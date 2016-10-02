package ua.epam.dao;

import ua.epam.ConnectionFactory;
import ua.epam.entity.Author;
import ua.epam.entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class EmployeeDao {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private Connection getConnection() throws SQLException {
        return ConnectionFactory.getInstance().getConnection();
    }

    public void add(Employee employee) {
        String query = "INSERT INTO employee(name, position, salary) VALUES(?,?,?)";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getPosition());
            preparedStatement.setInt(3, employee.getSalary());
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Employee> getAll() {
        String query = "SELECT * FROM employee";

        List<Employee> employees = new ArrayList<Employee>();

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Employee employee = new Employee(resultSet.getLong("id"), resultSet.getString("name"),
                        resultSet.getString("position"), resultSet.getInt("salary"));
                employees.add(employee);
            }

            preparedStatement.close();
            connection.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }


}
