package clz;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hishan
 */
public class DB {

    public static Connection myinstance;

    public static void updater(String para) throws ClassNotFoundException, SQLException {
        if (myinstance == null) {
            getConnection();
        }
        Statement s = myinstance.createStatement();
        s.executeUpdate(para);

    }

    public static ResultSet search(String searchable) throws ClassNotFoundException, SQLException {
        if (myinstance == null) {
            getConnection();
        }
        Statement s = myinstance.createStatement();
        ResultSet rs = s.executeQuery(searchable);
        return rs;
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        myinstance = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "123456");
        return myinstance;
    }
}