package com.test.utilities;

import java.sql.*;

public class SQLUtils {
	
	public Connection con;
	public ResultSet rs;
	public Statement st;
	
	public Connection openConnection()
	{
		try
		{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=abc;user=sa;pwd=sa");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	public ResultSet getTableValues(String sql)
	{
		try
		{
			
			st=openConnection().createStatement();
			st.executeQuery(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}

	public void updateTable(String sql)
	{
		
		try
		{
			st=openConnection().createStatement();
			st.executeUpdate(sql);
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
