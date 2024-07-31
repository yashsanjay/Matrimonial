package khizr3.jdbc;


import java.sql.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;

public static Connection createC() {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//create the connection...
			String user ="root";
			String password ="13BallB@99";
			String url ="jdbc:mysql://localhost:3306/matr_site";
			con  = DriverManager.getConnection(url,user,password);


		}catch(Exception e) {
			e.printStackTrace();
		}

		return con;
	}

}
