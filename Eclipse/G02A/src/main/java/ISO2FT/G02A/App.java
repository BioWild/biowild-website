package ISO2FT.G02A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	Connection conn = null;
    	Properties properties = new Properties();
    	properties.setProperty("user", "juan");
    	properties.setProperty("password", "juang");
    	properties.setProperty("useSSL", "false");
    	try {
    		conn = DriverManager.getConnection("jdbc:mysql://devgarrido.com/", properties);
    		System.out.println("It works!");
    		conn.close();
    	} catch (SQLException ex) {
    	    // handle any errors
    	    System.out.println("SQLException: " + ex.getMessage());
    	    System.out.println("SQLState: " + ex.getSQLState());
    	    System.out.println("VendorError: " + ex.getErrorCode());
    	}
    }
}
