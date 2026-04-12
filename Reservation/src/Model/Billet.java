package Model;

public class Billet {

    private int id;
    private String numero;
    private double prix;
    private String siege;
    private String classe;
    private String statut;

    private Reservation reservation;
    private Passager passager;
    private Vol vol;

    public static final String STATUT_RESERVE = "Réservé";
    public static final String STATUT_CONFIRME = "Confirmé";

    private static int compteurId = 1;

    public Billet(String numero,
                  double prix,
                  String siege,
                  String classe,
                  String statut,
                  Passager passager,
                  Vol vol,
                  Reservation reservation) throws InvalidDataException {

        this.id = compteurId++;
        setNumero(numero);
        setPrix(prix);
        setSiege(siege);
        setClasse(classe);
        setStatut(statut);
        setPassager(passager);
        setVol(vol);
        setReservation(reservation);
    }

    public int getId() { return id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) throws InvalidDataException {
        if (numero == null || numero.trim().isEmpty())
            throw new InvalidDataException("Numéro de billet invalide");
        this.numero = numero.trim();
    }

    public double getPrix() { return prix; }
    public void setPrix(double prix) throws InvalidDataException {
        if (prix <= 0)
            throw new InvalidDataException("Prix du billet invalide");
        this.prix = prix;
    }

    public String getSiege() { return siege; }
    public void setSiege(String siege) throws InvalidDataException {
        if (siege == null || siege.trim().isEmpty())
            throw new InvalidDataException("Siège invalide");
        this.siege = siege.trim();
    }

    public String getClasse() { return classe; }
    public void setClasse(String classe) throws InvalidDataException {
        if (classe == null || classe.trim().isEmpty())
            throw new InvalidDataException("Classe invalide");
        this.classe = classe.trim();
    }

    public String getStatut() { return statut; }
    public void setStatut(String statut) throws InvalidDataException {
        if (!STATUT_CONFIRME.equals(statut) && !STATUT_RESERVE.equals(statut))
            throw new InvalidDataException("Statut de billet invalide");
        this.statut = statut;
    }

    public Reservation getReservation() { return reservation; }
    public void setReservation(Reservation reservation) throws InvalidDataException {
        if (reservation == null)
            throw new InvalidDataException("Réservation obligatoire pour un billet");
        this.reservation = reservation;
    }

    public Passager getPassager() { return passager; }
    public void setPassager(Passager passager) throws InvalidDataException {
        if (passager == null)
            throw new InvalidDataException("Passager obligatoire pour un billet");
        this.passager = passager;
    }

    public Vol getVol() { return vol; }
    public void setVol(Vol vol) throws InvalidDataException {
        if (vol == null)
            throw new InvalidDataException("Vol obligatoire pour un billet");
        this.vol = vol;
    }

    @Override
    public String toString() {
        return "Billet n°" + numero +
                " | " + classe +
                " | Siège " + siege +
                " | " + prix + "$";
    }
}
