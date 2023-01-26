/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gestionbiblio;
import java.util.Date;
/**
 *
 * @author hammi
 */
public interface Operation {

   
    public void AjouterLivre(Livre l );//done
    public boolean RechercheLivre(Livre livre);//in progress
    public void SupprimerLivre(Livre livre);
    public boolean EstDisponible(Livre livre);
    public void AjouterAdherent(Adherent a);//Done
    public boolean RechercheAdherent(Adherent a);//Done
    public void SupprimerAdherent(Adherent a);//done
    public void Emprunter(Livre l, Etudiant a, Date demp);
    public void Rendre (Livre l, Etudiant a, Date dRetour);
}
