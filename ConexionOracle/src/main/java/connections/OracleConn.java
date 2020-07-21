/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author IAFAS
 */
public class OracleConn {
    public Connection getConn()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("OracleDriver not found");
            e.printStackTrace();
            return null;
        }
        
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe","cristian",
                    "cristian55"
            );
                    
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console.");
            e.printStackTrace();
            return null;
        }
        
        if (connection != null) {
            System.out.println("Connection Succed!");
            return connection;
            
        } else
        {
            System.out.println("Connection Failed!");
            return null;
        }
        
        
    }
    
}
