package ca.ulaval.glo4002.tda;

public class EmployeAnnuel implements Employe {

    private double salaireAnnuel;

    @Override
    public Paie calculerPaieSemaine() {
        double salairePeriodique = salaireAnnuel / 52.0;
        return new Paie(salairePeriodique);
    }
}
