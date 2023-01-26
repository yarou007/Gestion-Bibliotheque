/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblio;

/**
 *
 * @author hammi
 */
public class Livre extends Volume {
    private boolean disponible;


    public Livre(String titre, String auteur,boolean disponible) {
        super(titre, auteur);
        this.disponible = disponible;
    }
    public Livre(Livre l ){
         super(l.getTitre(),l.getAuteur());
         this.disponible=l.disponible;
    }
    public boolean getDisponible(){
       return disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }
  

    @Override
    public String toString() {
        super.Affiche();
        return "Livre{" + "disponible=" + disponible + "}\n";
    }
    
}
