package ua.epam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by irinapoliakova on 02.10.16.
 */
public class ConnectionFactory {

    private String driverClassName = "com.mysql.cj.jdbc.Driver";
    private String connectionUrl = "jdbc:mysql://localhost:3306/museum?useLegacyDatetimeCode=false&serverTimezone=America/New_York";
    private String dbUser = "root";
    private String dbPwd = "root";

    private static ConnectionFactory connectionFactory = new ConnectionFactory();

    private ConnectionFactory() {
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
    }

    public static ConnectionFactory getInstance() {
        return connectionFactory;
    }

}
