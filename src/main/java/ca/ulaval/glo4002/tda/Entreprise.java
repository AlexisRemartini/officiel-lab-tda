package ca.ulaval.glo4002.tda;

import java.util.List;

public class Entreprise {

    private SystemePaie systemePaie;
    private List<Employe> employes;

    Entreprise( List<Employe> employes, SystemePaie systemePaie ){
        this.employes = employes;
        this.systemePaie = systemePaie;
    }

    void payerEmployes(){
        for (Employe employe : employes) {
            Paie paie = employe.calculerPaieSemaine();
            systemePaie.payer(paie);
        }
    }
}
