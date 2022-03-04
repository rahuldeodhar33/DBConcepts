package Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
		Statement stm = con1.createStatement();
		//ResultSet result1 = stm.executeQuery("Select * from eproduct");
		stm.executeUpdate("update eproduct set price=4420 where name='TV'");
		ResultSet result1 = stm.executeQuery("select * from eproduct where name='TV'");
		while(result1.next()) {
			System.out.print(result1.getString("name"));
			System.out.print((" @ "));
			System.out.print(result1.getBigDecimal("price"));
		}
		con1.close();
	}

}
