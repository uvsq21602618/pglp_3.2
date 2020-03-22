package fr.uvsq.uvsq21602618.Pglp_3_2;
import java.util.ArrayList;

public class Entreprise {
	/*
	 * Liste d'employés de l'entreprise
	 */
	private ArrayList<Employe> listeEmp;
	/*
	 * Constructeur d'entreprise qui initialise la liste d'employés.
	 */
	public Entreprise() {
		listeEmp = new ArrayList<Employe>();
	}
	/*
	 * Méthode qui permet d'ajouter un employé à l'entreprise
	 * @param E L'employé à ajouter
	 */
	public void addEmploye(final Employe emp) {
		this.listeEmp.add(emp);
	}
	/*
	 * Méthode qui calcule la somme des salaires
	 *  des employés de l'entreprise
	 * @return la sommme du salaire de tous les employés de l'entreprise
	 */
	public double calculSommeSalaires() {
		double somme;
		somme = 0;
		for (Employe emp: listeEmp) {
			somme = somme + emp.calculSalaire();
		}
		return somme;
	}
}
