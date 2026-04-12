package model;

import java.util.Date;

public class Main {

        public static void main(String[] args)  {

//                // Paiement valide
//                Paiement paiement1 = new Paiement(750.00, "Carte de crédit", new Date());
//                paiement1.afficherPaiement();
//
//                System.out.println("\n-- Effectuer le paiement --");
//                paiement1.payer();
//                System.out.println("Statut : " + paiement1.getStatut());
//
//                System.out.println("\n-- Tenter de payer une deuxième fois --");
//                paiement1.payer(); // déjà payé
//
//                System.out.println("\n-- Remboursement --");
//                paiement1.rembourser();
//                System.out.println("Statut après remboursement : " + paiement1.getStatut());
//
//                // Paiement avec montant invalide (validation)
//                System.out.println("\n-- Test validation : montant négatif --");
//                Paiement paiementInvalide = new Paiement(-100, "PayPal", new Date());
//                System.out.println("Montant obtenu : " + paiementInvalide.getMontant());
//
//                // Paiement puis annulation
//                Paiement paiement2 = new Paiement(320.50, "Virement bancaire", new Date());
//                System.out.println("\n-- Annulation d'un paiement en attente --");
//                paiement2.annuler();
//                System.out.println("Statut : " + paiement2.getStatut());
//
//                                // --------------ADMIN------------------------
//                // Création admin valide
//                Admin admin = new Admin("Bernadine Ongoundou", "bernadine@gmail.com", "admin3011");
//                admin.afficherProfil();
//
//                System.out.println("\n-- Connexion correcte --");
//                admin.seConnecter("bernadine@gmail.com", "admin3011");
//
//                System.out.println("\n-- Connexion avec mauvais mot de passe --");
//                admin.seConnecter("bernadine@gmail.com", "mauvais");
//
//                System.out.println("\n-- Connexion avec champs null --");
//                admin.seConnecter(null, null);
//
//                // Tests de validation
//                System.out.println("\n-- Test validation : nom vide --");
//                Admin adminInvalide1 = new Admin("", "test@test.com", "abcd");
//                System.out.println("Nom obtenu : " + adminInvalide1.getNom());
//
//                System.out.println("\n-- Test validation : email sans @ --");
//                Admin adminInvalide2 = new Admin("Test", "emailsansarobase", "abcd");
//                System.out.println("Email obtenu : " + adminInvalide2.getEmail());
//
//                System.out.println("\n-- Test validation : mot de passe trop court --");
//                Admin adminInvalide3 = new Admin("Test", "test@test.com", "ab");
//                System.out.println("Mot de passe obtenu : " + adminInvalide3.getMotDePasse());
//
//                // Modification
//                System.out.println("\n-- Modifier l'email de l'admin --");
//                admin.setEmail("nouveau@airline.com");
//                admin.afficherProfil();
//
//                System.out.println("\n-- toString Admin --");
//                System.out.println(admin);

}
}
