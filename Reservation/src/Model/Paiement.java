package model;

import java.util.Date;

public class Paiement {

    private int id;
    private double montant;
    private String methode;
    private String statut;
    private Date datePaiement;

    // Constantes
    public static final String STATUT_EN_ATTENTE = "En attente";
    public static final String STATUT_PAYE = "Payé";
    public static final  String STATUT_REMBOURSE = "Remboursé";
    public static final  String STATUT_ANNULE = "Annulé";

    // Constructeur
    public Paiement( double montant, String methode, Date datePaiement) {

        // Validation du montant
        if (montant > 0) {
            this.montant = montant;
        } else {
            this.montant = 0;
            System.out.println("Montant invalide, valeur mise à 0.");
        }

        // Validation de la méthode
        if (methode != null && !methode.trim().isEmpty()) {
            this.methode = methode;
        } else {
            this.methode = "Non définie";
        }

        // Statut par défaut
        this.statut = STATUT_EN_ATTENTE;

        // Date
        if (datePaiement != null) {
            this.datePaiement = datePaiement;
        } else {
            this.datePaiement = new Date();
        }
    }

    // Méthode pour effectuer le paiement
    public void payer() {
        if (statut.equals(STATUT_PAYE)) {
            System.out.println("Le paiement est déjà effectué.");
        } else {
            statut = STATUT_PAYE;
            System.out.println("Paiement effectué avec succès.");
        }
    }

    // Méthode pour rembourser
    public void rembourser() {
        if (statut.equals(STATUT_PAYE)) {
            statut = STATUT_REMBOURSE;
            System.out.println("Paiement remboursé.");
        } else {
            System.out.println("Remboursement impossible : paiement non valide.");
        }
    }

    // Méthode pour annuler
    public void annuler() {
        if (statut.equals(STATUT_EN_ATTENTE)) {
            statut = STATUT_ANNULE;
            System.out.println("Paiement annulé.");
        } else {
            System.out.println("Annulation impossible.");
        }
    }

    // Méthode d'affichage 
    public void afficherPaiement() {
        System.out.println("----- Paiement -----");
        System.out.println("ID : " + id);
        System.out.println("Montant : " + montant);
        System.out.println("Méthode : " + methode);
        System.out.println("Statut : " + statut);
        System.out.println("Date : " + datePaiement);
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public String getMethode() {
        return methode;
    }

    public String getStatut() {
        return statut;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    // Setters avec validation
    public void setMontant(double montant) {
        if (montant > 0) {
            this.montant = montant;
        } else {
            System.out.println("Montant invalide.");
        }
    }

    public void setMethode(String methode) {
        if (methode != null && !methode.trim().isEmpty()) {
            this.methode = methode;
        } else {
            System.out.println("Méthode invalide.");
        }
    }

    public void setDatePaiement(Date datePaiement) {
        if (datePaiement != null) {
            this.datePaiement = datePaiement;
        } else {
            System.out.println("Date invalide.");
        }
    }

    @Override
    public String toString() {
        return "Paiement [ID=" + id +
                ", montant=" + montant +
                ", méthode=" + methode +
                ", statut=" + statut +
                ", date=" + datePaiement + "]";
    }
}
