/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package k.i.a;

/**
 *
 * @author Aditya
 */
import java.sql.*;
import javax.swing.*;
public class DBconnect {
    Connection con = null;
    public static Connection connectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con =DriverManager.getConnection("jdbc:sqlite:D:\\Portal\\K.I.A\\K.I.A.sqlite");
            return con;
        }
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
