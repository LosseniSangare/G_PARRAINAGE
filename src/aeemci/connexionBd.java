/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeemci;

import org.omg.CosNaming.NamingContextPackage.NotFound;
import java.sql.*;

/**
 *
 * @author LOSSENI SANGARE
 */
public class connexionBd {
    
    String urldriver ="com.mysql.jdbc.Driver";  //CHEMIN DE CHARGEMENT DU PILOTE
    String urlBD ="jdbc:mysql://localhost:3306/aemci"; // CHEMIN DE CONNEXION A LA BASE DE DONNEES
    Connection con;
    
    public connexionBd(){
    //chargement du pilote
        try{
           Class.forName(urldriver);
           System.out.println("chargement driver ok");
        }catch(ClassNotFoundException ex){
            System.out.print("ERREUR DRIVER "+ ex);
        }
        
        //CONNEXION A LA BASE DE DONNEES
        try{
            con = DriverManager.getConnection(urlBD,"root","");
            System.out.println("connexion a la base de Données reussir");
        }catch(SQLException ex){
            System.out.println("ERREUR CONNEXION");
        }
}
    
    Connection ObtenirConnexion(){
        return con;
    }
}
