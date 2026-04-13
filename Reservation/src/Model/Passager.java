package Model;

public class Passager
{
    private String numPasseport;
    private String nomComplet;
    private double bagages;

    public Passager(String numPasseport, String nomComplet, double bagages) {
        this.numPasseport = numPasseport;
        this.nomComplet = nomComplet;
        this.bagages = bagages;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "numPasseport='" + numPasseport + '\'' +
                ", nomComplet='" + nomComplet + '\'' +
                ", bagages=" + bagages +
                '}';
    }
}
