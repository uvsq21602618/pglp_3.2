package fr.uvsq.uvsq21602618.Pglp_3_2;
import java.util.Calendar;

/*
 * Cette classe correspond à un employé.
 */
public class Employe {
	/*
	 * Le nom de l'employé.
	 */
	private final String nom;
	/*
	 * L'année d'arrivée de l'employé
	 */
	private final int anneeArrivee;
	/*
	 * Le salaire de base de l'employé
	 */
	public static final int SALAIRE = 1500 + 20;
	/*
	 * Constructeur d'Employe.
	 * A la construction de l'employe, un nom et une année 
	 * d'arrivée sont mises en paramètre.
	 * @param nom1 Le nom de l'employé
	 * @param annee L'année d'arrivée de l'employé
	 */
	public Employe(final String nom1, final int annee) {
		this.nom = nom1;
		this.anneeArrivee = annee;
	}
	/*
	 * Méthode qui calcule le salaire d'un employé.
	 * @return le salaire de l'employé en fonction de son ancienneté
	 */
	public double calculSalaire() {
		Calendar c = Calendar.getInstance();
		int anneeCourante = c.get(Calendar.YEAR);
		return SALAIRE * (anneeCourante - anneeArrivee);
	}
	/*
	 * Méthode pour récupérer le nom de l'employé
	 * @return le nom de l'employé
	 */
	public String getNom() {
		return nom;
	}

}
