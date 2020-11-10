/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dht.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Utils {

    /**
     * @return the coon
     */
    

    
    private static Connection coon;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            coon = DriverManager.getConnection(
                    "jdbc:mysql://localhost/englishdb",
                    "root","123456"
            );
        } catch (ClassNotFoundException|SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    
    public static Connection getCoon() {
        return coon;
    }
}
