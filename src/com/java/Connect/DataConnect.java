package com.java.Connect;

import java.sql.Connection;
import java.sql.DriverManager;

import com.java.Connect.DataConnect;

    public class DataConnect {
	private static Connection con;
    public DataConnect()
    {
 	   try
 	   {
 	     Class.forName("com.mysql.jdbc.Driver");   
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Y1012Jqkhkp");
         System.out.print("done");
       }
 	   catch(Exception m)
 	   {
 		System.out.print(m.getMessage());   
 	   }
 	  }

public static Connection getConnection()
{
	 DataConnect d=new DataConnect();
	 return(con);
}
}


