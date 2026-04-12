package Model;

public class Avion {
        private int ID;
        private String modele;
        private int capacte;
        private CompagnieAerienne Compagnie;

        public Avion(String modele, int capacte, CompagnieAerienne compagnie) {
            this.modele = modele;
            this.capacte = capacte;
            Compagnie = compagnie;
        }

        public int getID() {
            return ID;
        }



        public CompagnieAerienne getCompagnie() {
            return Compagnie;
        }

        public void setCompagnie(CompagnieAerienne compagnie) {
            Compagnie = compagnie;
        }

        public String getModele() {
            return modele;
        }

        public void setModele(String modele) {
            this.modele = modele;
        }

        public int getCapacte() {
            return capacte;
        }

        public void setCapacte(int capacte) {
            this.capacte = capacte;
        }

        @Override
        public String toString() {
            return "Avion{" +
                    "\nID=" + ID +
                    "\nmodele='" + modele + '\'' +
                    "\ncapacte=" + capacte +
                    "\nCompagnie=" + Compagnie +
                    '}';
        }
    }

