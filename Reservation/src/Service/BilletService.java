package Service;


import Model.InvalidDataException;
import Model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BilletService {

    private List<Vol> vols = new ArrayList<>();
    private int compteurReservation = 1;
    private int compteurBillet = 1;

    public BilletService() {
        try {
            initialiserVols();
        } catch (InvalidDataException e) {
            System.out.println("Erreur init : " + e.getMessage());
        }
    }

    private void initialiserVols() throws InvalidDataException {
        CompagnieAerienne ac = new CompagnieAerienne("AC", "Canada");
        Avion a1 = new Avion("Boeing 777", 300, ac);

        vols.add(new Vol("Montréal", "Paris", "2025-06-01", "18:00", "Programmé", a1, 800, 50));
        vols.add(new Vol("Montréal", "Paris", "2025-06-02", "19:00", "Programmé", a1, 820, 30));
        vols.add(new Vol("Montréal", "Londres", "2025-06-01", "20:00", "Programmé", a1, 600, 20));
    }

    public List<Vol> rechercherVols(String depart, String destination) {
        return vols.stream()
                .filter(v -> v.getVilleDepartVol().equalsIgnoreCase(depart))
                .filter(v -> v.getVilleArriveeVol().equalsIgnoreCase(destination))
                .collect(Collectors.toList());
    }

    public Vol trouverVolParId(int id) {
        return vols.stream()
                .filter(v -> v.getIdVol() == id)
                .findFirst()
                .orElse(null);
    }

    public Reservation reserverEtPayer(Vol vol, Passager passager, int nbBillets)
            throws InvalidDataException {

        if (vol == null) throw new InvalidDataException("Vol introuvable");
        if (passager == null) throw new InvalidDataException("Passager invalide");

        vol.diminuerPlaces(nbBillets);

        Reservation r = new Reservation(
                compteurReservation++,
                new Date().toString(),
                passager,
                vol
        );

        Paiement p = new Paiement(vol.getPrix(), "Carte bancaire", new Date());
        p.payer();
        r.setPaiement(p);

        Billet b = new Billet(
                "BIL-" + compteurBillet++,
                vol.getPrix(),
                "12A",
                "Économique",
                Billet.STATUT_CONFIRME,
                passager,
                vol,
                r
        );
        r.setBillet(b);

        return r;
    }
}
