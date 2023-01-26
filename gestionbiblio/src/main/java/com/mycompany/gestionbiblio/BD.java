/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblio;

/**
 *
 * @author hammi
 */
public class BD extends Volume {
    private String dessinateur;

    public BD(String dessinateur, String titre, String auteur) {
        super(titre, auteur);
        this.dessinateur = dessinateur;
    }

    public String getDessinateur() {
        return dessinateur;
    }

    public void setDessinateur(String dessinateur) {
        this.dessinateur = dessinateur;
    }


    @Override
    public void Affiche(){
        super.Affiche();
        System.out.println(" dessinateur=" + dessinateur );
    }
    
    
}
