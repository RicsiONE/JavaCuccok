package query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractDao {

    private static final String URL = "jdbc:mysql://localhost:3306/bh14";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    private Connection connection;
    private Statement statement;
    private ResultSet rs;

    protected void connect() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        statement = connection.createStatement();
    }

    protected void close() throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    protected ResultSet getResult(String sql) throws SQLException {
        return statement.executeQuery(sql);
    }

    protected void execute(String sql) throws SQLException {
        statement.execute(sql);
    }
}
