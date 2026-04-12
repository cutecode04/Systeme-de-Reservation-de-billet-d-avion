package Model;

public class Passager {

    private String numPasseport;
    private String nomComplet;
    private double bagages;

    public Passager(String numPasseport, String nomComplet, double bagages) throws InvalidDataException {
        setNumPasseport(numPasseport);
        setNomComplet(nomComplet);
        setBagages(bagages);
    }

    public void setNumPasseport(String numPasseport) throws InvalidDataException {
        if (numPasseport == null || numPasseport.trim().length() < 3)
            throw new InvalidDataException("Passeport invalide");
        this.numPasseport = numPasseport.trim();
    }

    public void setNomComplet(String nomComplet) throws InvalidDataException {
        if (nomComplet == null || nomComplet.trim().length() < 3)
            throw new InvalidDataException("Nom passager invalide");
        this.nomComplet = nomComplet.trim();
    }

    public void setBagages(double bagages) throws InvalidDataException {
        if (bagages < 0)
            throw new InvalidDataException("Bagages invalides");
        this.bagages = bagages;
    }

    @Override
    public String toString() {
        return nomComplet + " (" + numPasseport + ")";
    }
}
