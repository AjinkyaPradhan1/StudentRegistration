/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ajinkya
 */
public class StudentRegistration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root" , "");
            System.out.println("Connection Successfull");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
