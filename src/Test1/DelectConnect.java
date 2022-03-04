package Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class DelectConnect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
		Statement stm1 = con1.createStatement();
		stm1.executeUpdate("delete from eproduct where name = 'TV'");
		ResultSet result1 = stm1.executeQuery("select * from eproduct");
		while(result1.next()) {
			System.out.println(result1.getString("name"));
		}
	}

}
