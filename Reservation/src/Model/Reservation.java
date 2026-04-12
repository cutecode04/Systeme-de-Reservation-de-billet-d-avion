package model;
import java.util.ArrayList;
import java.util.List;

public class Reservation {

    private int numero;
    private String statut;
    private String dateReservation;

    private Passager passager;
    private Vol vol;
    private Paiement paiement;
    private Billet billet;

    private int passagerId;
    private int volId;
    private int paiementId;

    private List<Integer> bagagesSupplementaires = new ArrayList<>();

    public Reservation() {}

    public Reservation(int numero, String statut, String dateReservation,
                       int passagerId, int volId, int paiementId) {
        this.numero = numero;
        this.statut = statut;
        this.dateReservation = dateReservation;
        this.passagerId = passagerId;
        this.volId = volId;
        this.paiementId = paiementId;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public String getDateReservation() { return dateReservation; }
    public void setDateReservation(String dateReservation) { this.dateReservation = dateReservation; }

    public Passager getPassager() { return passager; }
    public void setPassager(Passager passager) {
        this.passager = passager;
        if (passager != null) {
            this.passagerId = passager.getNumPasseport();
        }
    }

    public Vol getVol() { return vol; }
    public void setVol(Vol vol) {
        this.vol = vol;
        if (vol != null) {
            //this.volId = vol.getNumero();
        }
    }

    public Paiement getPaiement() { return paiement; }
    public void setPaiement(Paiement paiement) { this.paiement = paiement; }

    public Billet getBillet() { return billet; }
    public void setBillet(Billet billet) { this.billet = billet; }

    public int getPassagerId() { return passagerId; }
    public void setPassagerId(int passagerId) { this.passagerId = passagerId; }

    public int getVolId() { return volId; }
    public void setVolId(int volId) { this.volId = volId; }

    public int getPaiementId() { return paiementId; }
    public void setPaiementId(int paiementId) { this.paiementId = paiementId; }

    public void confirmer() {
        this.statut = "CONFIRMEE";
    }

    public void annuler() {
        this.statut = "ANNULEE";
    }

    public void changerSiege(String nouveauSiege) {
        if (billet != null) {
            billet.setSiege(nouveauSiege);
        }
    }

    public void ajouterBagageSupplementaire(int poids) {

        if (bagagesSupplementaires.size() >= 3) {
            System.out.println("Maximum 3 bagages autorisés");
            return;
        }

        if (poids > 23) {
            System.out.println("Poids max = 23kg");
            return;
        }

        if (poids <= 0) {
            System.out.println("Poids invalide");
            return;
        }

        bagagesSupplementaires.add(poids);
        System.out.println("Bagage ajouté: " + poids + "kg");
    }

    public int getTotalBagages() {
        int total = 0;
        for (int poids : bagagesSupplementaires) {
            total += poids;
        }
        return total;
    }

    public void afficherBagages() {
        System.out.println("Bagages: " + bagagesSupplementaires);
    }

    public void upgraderClasse(String nouvelleClasse) {

        if (billet == null) {
            System.out.println("Aucun billet");
            return;
        }

        if (billet.getClasse().equalsIgnoreCase("economique") &&
                (nouvelleClasse.equalsIgnoreCase("business") || nouvelleClasse.equalsIgnoreCase("first"))) {

            billet.setClasse(nouvelleClasse);
            System.out.println("Upgrade réussi");

        } else if (billet.getClasse().equalsIgnoreCase("business") &&
                nouvelleClasse.equalsIgnoreCase("first")) {

            billet.setClasse(nouvelleClasse);
            System.out.println("Upgrade réussi");

        } else {
            System.out.println("Upgrade non autorisé");
        }
    }

    public void afficherReservation() {
        System.out.println("=== RESERVATION ===");
        System.out.println("Numero: " + numero);
        System.out.println("Statut: " + statut);
        System.out.println("Date: " + dateReservation);
        System.out.println("Passager ID: " + passagerId);
        System.out.println("Vol ID: " + volId);

        if (billet != null) {
            System.out.println("Classe: " + billet.getClasse());
            System.out.println("Siege: " + billet.getSiege());
        }

        System.out.println("Bagages: " + bagagesSupplementaires);
        System.out.println("===================");
    }
}
