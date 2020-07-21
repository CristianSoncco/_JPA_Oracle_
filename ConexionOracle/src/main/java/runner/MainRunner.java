/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

import connections.OracleConn;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author IAFAS
 */
public class MainRunner {
    public static void main(String[] args)
    {
        OracleConn oracleConn = new OracleConn();
        Connection conn  = oracleConn.getConn();
        if (conn!=null) try {
            conn.close();
            System.out.println("conn closed..");
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }
}
