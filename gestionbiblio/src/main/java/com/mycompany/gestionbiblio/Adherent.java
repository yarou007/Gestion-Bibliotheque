/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblio;

/**
 *
 * @author hammi
 * @param <E>
 */
abstract public class Adherent<E> {
    protected int ident;
    protected String nom;
    protected String prenom;
    
    protected Adherent(){}
    
    protected Adherent(int ident, String nom, String prenom){
    this.ident=ident;
    this.nom=nom;
    this.prenom=prenom;
      }

    protected int getIdent() {
        return ident;
    }

    protected void setIdent(int ident) {
        this.ident = ident;
    }

    protected String getNom() {
        return nom;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    protected String getPrenom() {
        return prenom;
    }

    protected void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    protected void affiche(){
        System.out.print(nom+" "+prenom+" avec ID: "+ident);
    }
    
}
