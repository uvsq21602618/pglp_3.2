package fr.uvsq.uvsq21602618.Pglp_3_2;
/**
 * La classe Vendeur.
 * @author Nathalie
 */
public class Vendeur extends Employe {
    /**
     * La commission d'un vendeur.
     */
    private double commission;
    /**
     * Le constructeur du vendeur avec une
     * commission initiale de 0.
     * @param nom Le nom du vendeur.
     * @param annee l'annee d'arrivee du vendeur
     * dans l'entreprise.
     */
    public Vendeur(final String nom, final int annee) {
        super(nom, annee);
        this.commission = 0;
    }
    /**
     * Méthode qui calcule le salaire du vendeur avec la commission.
     */
    @Override
    public double calculSalaire() {
        return super.calculSalaire() + commission;
    }
    /**
     * Méthode qui définit la commission du vendeur.
     * @param com la commission
     */
    public void setCommission(final double com) {
        this.commission = com;
    }

}
