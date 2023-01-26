/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblio;

import java.util.Date;



/**
 *
 * @author hammi
 */
public class Journal extends Document {
    private Date date_parution;

    public Journal(Date date_parution, String titre) {
        super(titre);
        this.date_parution = date_parution;
    }

    public Date getDate_parution() {
        return date_parution;
    }

    public void setDate_parution(Date date_parution) {
        this.date_parution = date_parution;
    }
    
    public void Affiche(){
        System.out.println("Date de parution de "+getTitre()+"est "+getDate_parution());
    }

    
    
    
    
    
    
}
