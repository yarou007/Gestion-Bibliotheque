/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblio;

/**
 *
 * @author hammi
 */
abstract public class Document {
    private String titre;
    
    
    protected Document(){}
    
    protected Document(String titre){
        this.titre=titre;
    }
    
    protected String getTitre(){
        return titre;
    }
    protected void setTitre(String titre){
        this.titre=titre;
    }
    
}
