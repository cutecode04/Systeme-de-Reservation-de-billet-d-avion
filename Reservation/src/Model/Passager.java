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

    public String getNumPasseport() {
        return numPasseport;
    }

    public void setNumPasseport(String numPasseport) {
        this.numPasseport = numPasseport;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public double getBagages() {
        return bagages;
    }

    public void setBagages(double bagages) {
        this.bagages = bagages;
    }
}
