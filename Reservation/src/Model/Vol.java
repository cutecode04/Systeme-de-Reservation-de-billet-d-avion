package model;

public class Vol
{
        // Les attributs
        private int idVol;
        private String villeDepartVol;
        private String villeArriveeVol;
        private String dateDepartVol;
        private String heureDepartVol;
        private String statutVol;
        private Avion Avion;

        // Le constructeur avec tous les parametres
        public Vol(String villeDepartVol, String villeArriveeVol, String dateDepartVol, String heureDepartVol, String statutVol, Avion avion) {
            this.villeDepartVol = villeDepartVol;
            this.villeArriveeVol = villeArriveeVol;
            this.dateDepartVol = dateDepartVol;
            this.heureDepartVol = heureDepartVol;
            this.statutVol = statutVol;
            Avion = avion;
        }

        // Constructeur avec un seul parametre pour creer l'objet vol avec id seulement
        public Vol(Avion avion) {
            Avion = avion;
        }

        // Les getters et setters


        public int getIdVol() {
            return idVol;
        }

        public String getVilleDepartVol() {
            return villeDepartVol;
        }

        public void setVilleDepartVol(String villeDepartVol) {
            this.villeDepartVol = villeDepartVol;
        }

        public String getVilleArriveeVol() {
            return villeArriveeVol;
        }

        public void setVilleArriveeVol(String villeArriveeVol) {
            this.villeArriveeVol = villeArriveeVol;
        }

        public String getDateDepartVol() {
            return dateDepartVol;
        }

        public void setDateDepartVol(String dateDepartVol) {
            this.dateDepartVol = dateDepartVol;
        }

        public String getHeureDepartVol() {
            return heureDepartVol;
        }

        public void setHeureDepartVol(String heureDepartVol) {
            this.heureDepartVol = heureDepartVol;
        }

        public String getStatutVol() {
            return statutVol;
        }

        public void setStatutVol(String statutVol) {
            this.statutVol = statutVol;
        }

        public Avion getAvion() {
            return Avion;
        }

        public void setAvion(Avion avion) {
            Avion = avion;
        }

        // L'affichage
        @Override
        public String toString() {
            return "Vol{" +
                    "idVol=" + idVol +
                    ", villeDepartVol='" + villeDepartVol + '\'' +
                    ", villeArriveeVol='" + villeArriveeVol + '\'' +
                    ", dateDepartVol='" + dateDepartVol + '\'' +
                    ", heureDepartVol='" + heureDepartVol + '\'' +
                    ", statutVol='" + statutVol + '\'' +
                    ", Avion=" + Avion +
                    '}';
        }
    }

