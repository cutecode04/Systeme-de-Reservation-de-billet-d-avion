package Model;

public abstract class Utilisateur {

    protected int id;
    protected String nom;
    protected String email;
    protected String motDePasse;

    public Utilisateur(String nom, String email, String motDePasse) throws InvalidDataException {
        setNom(nom);
        setEmail(email);
        setMotDePasse(motDePasse);
    }

    public void setNom(String nom) throws InvalidDataException {
        if (nom == null || nom.trim().length() < 2)
            throw new InvalidDataException("Nom invalide");
        this.nom = nom.trim();
    }

    public void setEmail(String email) throws InvalidDataException {
        if (email == null || !email.contains("@"))
            throw new InvalidDataException("Email invalide");
        this.email = email.trim();
    }

    public void setMotDePasse(String motDePasse) throws InvalidDataException {
        if (motDePasse == null || motDePasse.length() < 4)
            throw new InvalidDataException("Mot de passe trop court");
        this.motDePasse = motDePasse;
    }

    public String getNom() { return nom; }

    @Override
    public String toString() {
        return nom + " (" + email + ")";
    }
}
