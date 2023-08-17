package com.myjdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.DatabaseMetaData;

import java.sql.ResultSetMetaData;

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
//Statement st=c.createStatement();

/*PreparedStatement ps=c.prepareStatement("insert into emp values(?,?)");
ps.setInt(1,9000);
ps.setString(2, "Zaid");
ps.executeUpdate();
ps.setInt(1,9000);
ps.setString(2, "Zaid");


ps.executeUpdate();*/


// Lets fetch yhe details of the employee with a given employee id
PreparedStatement ps=c.prepareStatement("select *  from emp where eid=?");
ps.setInt(1, 11);

ResultSet res=ps.executeQuery();
if(res.next())
{
	System.out.println(res.getString("ename"));
}



// with Statemnt
Statement st=c.createStatement();
ResultSet res1=st.executeQuery("select *  from emp where eid=10");
if(res1.next())
{
	System.out.println(res1.getString("ename"));
}



ResultSetMetaData rsm=res1.getMetaData();
System.out.println(rsm.getColumnCount());
System.out.println(rsm.getColumnName(1));


DatabaseMetaData dmd=c.getMetaData();

System.out.println(dmd.getDatabaseMajorVersion());
System.out.println(dmd.getDatabaseProductVersion());


    }
}
