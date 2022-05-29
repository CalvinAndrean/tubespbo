/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Jolly Hans Frankle - 200710932
package connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    public static Connection CON;
    public static final String URL = "jdbc:mysql://";
    public static final String PATH = "202.14.92.91:3306/ifestuajy_pbo2122?useSSL=false";
    public static final String USER = "ifestuajy_pbo2122";
    public static final String PWD = "ifestuajy_pbo2122";
    
    public Connection makeConnection() {        
        System.out.println("Opening database..");
        try {
            CON = DriverManager.getConnection(URL + PATH, USER, PWD);
            System.out.println("success!");
        } catch (Exception e) {
            System.out.println("Error opening database..");
            System.out.println(e.toString());
            
        }
        
        return CON;
    }
    
    public void closeConnection() {
        System.out.println("Closing database..");
        try {
            CON.close();
            System.out.println("success!");
        } catch (Exception e) {
            System.out.println("Error closing database..");
            System.out.println(e.toString());
        }
    }
}