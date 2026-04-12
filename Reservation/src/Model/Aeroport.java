package Model;

public class Aeroport
{
    int idAeroport;
    String nom;
    String ville;
    String pays;

    public Aeroport(String ville, String pays) {
        this.ville = ville;
        this.pays = pays;
    }

    public int getIdAeroport() {
        return idAeroport;
    }

    public void setIdAeroport(int idAeroport) {
        this.idAeroport = idAeroport;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
