/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adsi;

import java.sql.*;
import javax.swing.JOptionPane;
;

/**
 *
 * @author ADMIN
 */
public class connection {
    
    Connection conectar = null;
    
    String usuario = "postgres";
    String contrasena = "root";
    String bd = "Gestion_de_proyecto";
    String ip = "localhost";
    String puerto = "5432";
    
     String cadena = "jdbcpostgresql://"+ip+"/"+puerto+"/"+bd;
     
     public connection establecercon(){
         
         try {
             
             Class.forName("org.postgresql.Driver");
             
             conectar = DriverManager.getConnection(cadena,usuario,contrasena);
             
             JOptionPane.showMessageDialog(null,"se conecto correctamente a la base de datos");
             
         } catch (Exception e) {
             
             JOptionPane.showMessageDialog(null,"ERROR"+ e . toString() );
             
         }
         return (connection) conectar;
     } 
    
}
