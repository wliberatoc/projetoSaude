/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Willian
 */
public class ConnectionF {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/consultorio";
    private static final String user = "root";
    private static final String pass = "";
    
    public static Connection getConnection(){    
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, pass);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException ("Erro ao tentar conectar",ex);
        }
    }//fim get Conection
    
    public static void closeConnection(Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//fim close conection
    
    public static void closeConnection(Connection conn, PreparedStatement stmt){
        closeConnection(conn);
        try {
           if(stmt != null)
               stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionF.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//fim close conection + stmt
    
    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs){
        closeConnection(conn, stmt);
        try {
           if(rs != null)
               rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionF.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//fim close conection + stmt +rs
        
    
}//fim clase Connection
