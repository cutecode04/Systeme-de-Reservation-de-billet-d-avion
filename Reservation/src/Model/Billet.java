package model;
public class Billet
{
    private int id;
    private String numero;
    private Double prix;
    private String siege;
    private String classe;
    private String statut;
   private Reservation resevation;
    private Passager passager;
    private Vol unvol;

    public String getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
//        if(numero==null){
//            System.out.println("Le numero de billet ne peut pas etre vide   ! ");
//        }
//        else
//        {
//            this.numero = numero;
//        }

    }

    public int getId() {
        return id;
    }


    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        if (prix == null || prix <= 0)
        {
            System.out.println("Le prix doit supérieur à 0 !");
        }
        else {
            this.prix = prix;
        }

    }

    public String getSiege() {
        return siege;
    }

    public void setSiege(String siege) {
        if(siege==null)
        {
            System.out.println("Le siege ne peut pas etre vide ! ");
        }else {

            this.siege = siege;
        }

    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        if(statut!="Confirmé"&& statut!="Reservé")
        {
            System.out.println("Statut invalide ! ");
        }
        else
        {
            this.statut = statut;
        }

    }



    public void setResevation(Reservation resevation) {
        if (resevation == null) {
            System.out.println("La reservation n doit exister ! ");
        }
        else{
            this.resevation = resevation;
        }


    }

    public Passager getPassager() {
        return passager;
    }

    public void setPassager(Passager passager) {

        if (passager == null) {
            System.out.println("Le passager doit exister ! ");
        }
        else{
            this.passager = passager;
        }

    }

    public Vol getUnvol() {
        return unvol;
    }

    public void setUnvol(Vol unvol) {
        this.unvol = unvol;
    }

    @Override
    public String toString() {
        return "Billet{" +
                "\nnumero='" + numero + '\'' +
                "\nprix=" + prix +
                "\nsiege='" + siege + '\'' +
                "\nclasse='" + classe.getClass() + '\'' +
                "\nstatut='" + statut + '\'' +
                "\nresevation=" + resevation.getNumero();
                //"\npassager=" + passager.getNomComplet()  + " Numero :  " + passager.getNumPasseport();

    }


}
