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
    public class Emprunt {
        private Etudiant etudiant;
        private Livre livre;
        private Date dateEmp;
        private Date dateRet;

        public Emprunt(Etudiant etudiant, Livre livre, Date dateEmp) {
            this.etudiant = etudiant;
            this.livre = livre;
            this.dateEmp = dateEmp;
            this.dateRet=null;
        }
        public Etudiant getEtudiant(){
            return etudiant;
        }
        public Livre getLivre(){
            return livre;
        }
        public Date getDateEmp(){
            return dateEmp;
        }
        public Date getDateRet(){
            return dateRet;
        }
        public void setDateRet(Date dateRet){
          this.dateRet=dateRet;
        }



    }
