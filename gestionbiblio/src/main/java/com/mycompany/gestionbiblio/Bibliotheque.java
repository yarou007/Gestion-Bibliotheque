/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestionbiblio;
import java.time.LocalDateTime;
import java.util.Vector;
import java.util.*;
import java.util.Scanner;


/**
 *
 * @author hammi
 */
public class Bibliotheque implements Operation  {
     Scanner clavier = new Scanner (System.in);
     
   static Vector<Adherent>adherents=new Vector<Adherent>();
   static Vector<Livre>livres=new Vector<Livre>();
   static Vector<Emprunt>emprunts=new Vector<Emprunt>();
   
    @Override
      public void AjouterAdherent(Adherent a){
         adherents.add(a);
      }
    
     @Override
    public boolean RechercheAdherent(Adherent a){
    
     Adherent p=null;
     for(Adherent px:adherents){
         if(px.getIdent()==a.getIdent())
             p=px;
             SupprimerAdherent(p);
             return true;   
     }
  
        return false;
                    
 }  
      
  @Override
  public void AjouterLivre(Livre l ){
       livres.add(l);
      
  }
    @Override
  public boolean RechercheLivre(Livre livre){  
         Livre d=null;
     for(Livre tx:livres){
         if(tx.getTitre().equalsIgnoreCase(livre.getTitre()));
             d=tx;
             SupprimerLivre(d);
             return true;   
     }
        return false;
                 
  }
    @Override
   public void SupprimerLivre(Livre livre){   
       boolean ok = livres.remove(livre);
            if (ok){
                 System.out.println("Le suppression de livre a été affecté");
                }else{
                 System.out.println("Livre pas trouvable");
                 }
  }
    @Override
   public boolean EstDisponible(Livre livre){
      
        return livre.getDisponible();
      
  }
   
    @Override
   public void SupprimerAdherent(Adherent a){
        boolean ok = adherents.remove(a);
            if (ok){
                 System.out.println("Le suppression a été affecté");
                }else{
                 System.out.println("Adherent pas trouvable");
                 }
  }
    @Override
    public void Emprunter(Livre l, Etudiant a, Date demp){
       if(EstDisponible(l)){
            Emprunt emp= new Emprunt(a, l, demp);
            emprunts.add(emp); 
       } 
      
    }
     @Override
    public void Rendre(Livre l, Etudiant a, Date dRetour) {
        for (Emprunt emp:emprunts){
            if(emp.getEtudiant().ident==a.ident){
                emp.setDateRet(dRetour);
            }
        }
    
    }

    public static void main(String[] args) {
        
        /* tout le programme et les methodes sont executable sauf que les methodes de rendre livre et emprunter livre */
       Scanner in = new Scanner (System.in);
            Bibliotheque b1 = new Bibliotheque();
            int id_Rech;
            int rep;
    do
    {
        System.out.println("Gestion de Bibliotheque ");

        System.out.println("1.Ajouter Adherent");
        System.out.println("2.Supprimer Adherent // recherche adherent");
       
        System.out.println("3.Ajouter Livre (True or false)");
        System.out.println("4.Supprimer Livre // affichage");
        System.out.println("5.Emprunter Livre");
        System.out.println("6.Rendre Livre");
        System.out.println("7.Pour Quitter");
        System.out.println();
        System.out.println("------Entrer Votre choix : ");
         rep= in.nextInt();
        
        switch(rep){
            case 1:  
        System.out.println("Etudiant E ou Enseignant P");
         String repAdh=in.next();
        if (repAdh.equals("E")){
            int id;
            String nom, prenom,classe;
            Adherent etud =new Etudiant();
            System.out.println("Enter ID Etudiant : ");
            id=in.nextInt();
            in.nextLine();
            System.out.println("Enter Nom Etudiant : ");
            nom=in.nextLine();
            System.out.println("Enter Premon Etudiant : ");
            prenom=in.nextLine();
            System.out.println("Enter Classe de l'Etudiant: ");
            classe=in.nextLine();
         Adherent etud1 =new Etudiant(id,nom,prenom,classe);
         b1.AjouterAdherent(etud1);
       }else{
            if(repAdh.equals("P")){
                int id;
            String nom, prenom,classe;
            Adherent etud =new Etudiant();
            System.out.println("Enter ID Enseignant : ");
            id=in.nextInt();
            in.nextLine();
            System.out.println("Enter Nom Enseignant : ");
            nom=in.nextLine();
            System.out.println("Enter Premon Enseignant : ");
            prenom=in.nextLine();
            System.out.println("Enter Departement de l'Enseignant: ");
            classe=in.nextLine();
             Adherent Enseignant =new Etudiant(id,nom,prenom,classe);
             b1.AjouterAdherent(Enseignant);
            }
            else{
                System.out.println("Saisir pas correct!! ");
            }       
        };
        break;
            case 2:  
////////// Recherche Adherent 
                Adherent ad;
                    System.out.println("Donner ID"); 
                    id_Rech=in.nextInt();
                    in.nextLine();
                    System.out.println("Nom: ");
                    String nom_rech=in.nextLine();
                    System.out.println("Prenom: ");
                    String prenom_rech=in.nextLine();
                    System.out.println("Etudiant E ou Enseignant P: ");
                    String type=in.next();
                    in.nextLine();
                    if (type.equalsIgnoreCase("E")){
                         System.out.println("Classe: ");
                         String classe=in.nextLine();
                          ad=new Etudiant(id_Rech,nom_rech,prenom_rech,classe);
                    }else{
                        System.out.println("Donner Dept ");
                        String dep=in.nextLine();
                         ad=new Enseignant(id_Rech,nom_rech,prenom_rech,dep);
                    }
                     System.out.println("Liste des Personnes - Avant la suppression : ");
                     for(Adherent px: adherents){
                        px.affiche();
                     }
                     System.out.println("Taile = "+adherents.size());
                     b1.RechercheAdherent(ad);
                    System.out.println("Liste des Personnes - Aprés la suppression : ");
                     for(Adherent px: adherents){
                         px.affiche();
                     }
                     System.out.println("Taile = "+adherents.size());
                     break;
            case 3:  System.out.println("Le Titre de livre");
            String t=in.nextLine();
            in.nextLine();
                System.out.println("l'auteur de livre: ");
            String au=in.nextLine();
                System.out.println("Livre disponible ? true or false ? ");
            boolean disp=in.nextBoolean();
            Livre l = new Livre(t,au,disp);
                b1.AjouterLivre(l);
                break;
            case 4: 
                Livre liv;
                System.out.println("Donner le titre de livre a recherché: ");
                String tit_liv=in.nextLine();
                in.nextLine();
                
                liv = new Livre(tit_liv,null,false);
                System.out.println("Liste des livre - Avant la suppression : ");
                     for(Livre px: livres){
                         px.toString();
                     }
                     System.out.println("Taile = "+livres.size());
                     b1.RechercheLivre(liv);
                     System.out.println("Liste des livre - Aprés la suppression : ");
                     for(Livre px: livres){
                         px.toString();
                     }
                     System.out.println("Taile = "+livres.size());
                
            break;
            case 5:   
                System.out.println("Titre de livre : ");
                tit_liv=in.nextLine();
                in.nextLine();
                System.out.println("Auteur de livre : ");
                tit_liv=in.nextLine();
        
                Livre liv_emp = new Livre(tit_liv,null,false);
                System.out.println("le nom Etudiant: ");
                String etud_nom = in.nextLine();
                System.out.println("ID etudiant : ");
                int id = in.nextInt();
                Etudiant etud_emp=new Etudiant(id,etud_nom,null,null);
                Date dateEmp = new Date();
                b1.Emprunter(liv_emp, etud_emp, dateEmp);
                
                break;
            
        }        
    }while(rep!=6);
 
    }
    
}
