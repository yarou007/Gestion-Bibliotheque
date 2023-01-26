/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblio;

/**
 *
 * @author hammi
 */
abstract public class Volume extends Document {
    private String auteur;
    
    protected Volume(String titre, String auteur){
        super(titre);
        this.auteur=auteur;
    }
    protected String getAuteur(){
        return auteur;
    }
    protected void setAuteur(String auteur){
        this.auteur=auteur;
    }
    protected void Affiche(){
     System.out.print("Le titre est "+this.getTitre()+" L'auteur est "+getAuteur());

    }
}
