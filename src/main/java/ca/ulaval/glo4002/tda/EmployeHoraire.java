package ca.ulaval.glo4002.tda;

public class EmployeHoraire implements Employe {

    double tauxHoraire;
    double heuresTravaillees;

    @Override
    public Paie calculerPaieSemaine() {
        double taux = tauxHoraire;
        double heures = heuresTravaillees;
        return new Paie(taux * heures);
    }
}
