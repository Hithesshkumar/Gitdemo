package Sampmavan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databaseconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
     String url;
		
		url = "jdbc:mysql://127.0.0.1:3306/dmart";
		
	Connection connect = 	DriverManager.getConnection(url,"root","Kamal@1422");
		
	Statement state =	connect.createStatement();
	
    ResultSet res =	state.executeQuery("select *from orders");
    
    while(res.next())
    {
		System.out.println(res.getString("cust_id"));
		
	}

		
		
	}

}
