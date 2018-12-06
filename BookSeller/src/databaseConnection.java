import java.sql.*;

public class databaseConnection {

	public static Connection getConnection() {
Connection connection=null;
try {
	Class.forName("org.sqlite.JDBC");
	connection=DriverManager.getConnection("jdbc:sqlite:F:\\Ekram\\Database Connection\\Instractor.sqlite");
	System.out.println("Open Database ");
	
} catch (Exception e) {
	System.out.println(e);
}


    return connection;
	}

}
