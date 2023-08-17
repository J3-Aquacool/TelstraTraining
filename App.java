package com.myjdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	// Load the Driver in the Code
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	System.out.println("Loaded Driver");
    //Step 2: Establish/Obtain the connection with db using getConnection() of DriverManager class	
    	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3305/batch2","root","admin");
System.out.println("Connection Establised");
Statement st=c.createStatement();
ResultSet res=st.executeQuery("select * from emp");  	

while(res.next())
{
System.out.println(res.getInt(1));
System.out.println(res.getString(2));
}
// send some data
st.executeUpdate("insert into emp  values(109,'Akash')");



res.close();
st.close();
c.close();

    }
}
