package DBUtil;

import java.sql.*;



public class DBUtility {
 private static Connection connection = null;

    public static Connection getConnection() {
        try {
         if (connection != null)
         {
                return connection;
                }
        else {
        		Class.forName("com.mysql.jdbc.Driver");
        		connection = DriverManager
            		.getConnection("jdbc:mysql://localhost:3306/taskdb","root", "root");
        }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
        	System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        if (connection != null) {
        	System.out.println("You made it, take control your database now!");
        } else {
        		System.out.println("Failed to make connection!");
        }
         return connection;
        }

    }