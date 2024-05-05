/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_javainfo2;

/**
 *
 * @author user
 */

import java.sql.Connection;
import java.sql.DriverManager;


public class db {
    
    public static Connection mycon(){
        
        Connection con= null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gestion_materiel", "root","");
        
        } catch(Exception e){
            
            System.out.println(e);
            
        }
        return con;
        
    }
    
}
