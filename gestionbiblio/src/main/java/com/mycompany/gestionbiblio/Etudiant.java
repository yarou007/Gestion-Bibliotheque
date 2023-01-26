/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblio;

/**
 *
 * @author hammi
 */
public class  Etudiant extends Adherent {
  private String classe;

    public Etudiant() {
    }
   
    public Etudiant(int ident ,String nom,String prenom, String classe){
        super(ident,nom,prenom);
        this.classe=classe;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
  @Override
    public void affiche(){
      //System.out.println("Id: "+ident+" nom : "+nom+" prenom: "+prenom+" Classe: "+classe);
      super.affiche();
      System.out.println(" Classe :"+classe);
    }

    
}
