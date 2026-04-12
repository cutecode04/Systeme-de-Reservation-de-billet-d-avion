package model;

public class Admin extends Utilisateur {

    private String poste;

    public Admin(String nom, String email, String motDePasse, String poste) {
        super(nom, email, motDePasse);
        this.poste = poste;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
    public void gererVol() {
        System.out.println("L'admin " + nom + " modifie un vol.");
    }
}
