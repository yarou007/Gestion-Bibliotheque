    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.mycompany.gestionbiblio;

    /**
     *
     * @author hammi
     */
    public class Enseignant extends Adherent {
        private String departement;

        public Enseignant() {
        }

        public Enseignant(int ident, String nom, String prenom, String classe)  {
            super(ident,nom,prenom);
            this.departement=classe;
        }

        public String getDepartement() {
            return departement;
        }

        public void setDepartement(String departement) {
            this.departement = departement;
        }
        @Override
        public void affiche()
        {   super.affiche();
           System.out.println("Departement: "+departement);
        }

    }
