package fr.uvsq.uvsq21602618.Pglp_3_2;
/*
 * Classe du manager qui hérite de Employe
 */
public class Manager extends Employe {
	/*
	 * Le nombre de personnes dont le manager est en charge
	 */
	private int nbSubalternes;
	public static final int CENT = 100;
	/*
	 * Le constructeur de Manager.
	 *  Par défaut un manager a 1 subalterne.
	 * @param nom Le nom du manager
	 * @param annee l'annee d'arrivée du manager
	 */
	public Manager(final String nom, final int annee) {
		super(nom, annee);
		nbSubalternes = 1;
	}
	/*
	 * Méthode qui calcule le salaire du manager
	 *  en fonction du nombre de subalterne;
	 * @return retourne le salaire du manager
	 */
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + nbSubalternes * CENT;
	}
	/*
	 * Définit le nombre de subalternes du manager
	 */
	public void setNbSubalternes(final int nb) {
		this.nbSubalternes = nb;
	}

}
