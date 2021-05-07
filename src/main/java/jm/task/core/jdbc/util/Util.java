package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest ? useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rooot";

    private Connection conn = null;

    public static Connection getMySQLConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException throwables) {

        }
        return conn;

    }
}

// реализуйте настройку соеденения с БД
// Connect to MySQL
//    public static Connection getMySQLConnection() throws SQLException,
//            ClassNotFoundException {
//        String hostName = "localhost";
//
//        String dbName = "mydbtest";
//        String userName = "root";
//        String password = "rooot";
//
//        return getMySQLConnection(hostName, dbName, userName, password);
//    }
//
//    public static Connection getMySQLConnection(String hostName, String dbName,
//                                                String userName, String password) throws SQLException,
//            ClassNotFoundException {
//        // Declare the class Driver for MySQL DB
//        // This is necessary with Java 5 (or older)
//        // Java6 (or newer) automatically find the appropriate driver.
//        // If you use Java> 5, then this line is not needed.
//        // Class.forName("com.mysql.jdbc.Driver");
//        //URL = "jdbc:mysql://localhost:3306/mydbtest?useSSL=false";
//        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName + "? useSSL=false & serverTimezone= Etc/GMT-3" ;
//
//        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
//        return conn;
//    }
//}
