package fr.uvsq.uvsq21602618.Pglp_3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Classe contenant les tests de la classe Entreprise.
 * @author Nathalie
 *
 */
public class TestEntreprise {
    /**
     * Test de la méthode CalculSommeSalaires.
     */
	@Test
	public void testCalculSommeSalaires() {
		Entreprise E = new Entreprise();
		Employe e = new Employe("John SMITH",2015);
		Vendeur v = new Vendeur("Jean MARTIN",2015);
		v.setCommission(100.5);
		Manager m = new Manager("Joe SMITH",2010);
		E.addEmploye(e);
		E.addEmploye(v);
		E.addEmploye(m);
		
		double expected;
		expected = (1500 + 20 * 5) + ((1500 + 20 * 5) + 100.5)
		        + (1500 + 20 * 10) + 100;
		
		assertEquals(expected,E.calculSommeSalaires(),0);
		
	}
}
