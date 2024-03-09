/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rds.db.pkg02;
import java.sql.*;

/**
 *
 * @author Ringo
 */
public class Database {
//    private Connection conn() throws SQLException
//    {
//        Connection conn = DriverManager.getConnection("jdbc:sqlite:Rds.db");
//        return conn;
//    }
    
    public ResultSet allArtists() throws SQLException, ClassNotFoundException
    {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:Rds.db");
        conn.setAutoCommit(false);
        System.out.println("Opened database successfully");

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT * FROM artists_tb;" );
        
//        while ( rs.next() ) {
//            int id = rs.getInt("id");
//            String  name = rs.getString("name");
//
//            System.out.println( "ID = " + id );
//            System.out.println( "NAME = " + name );
//            System.out.println();
//        }
        

        return rs;
    }
    
    
}
