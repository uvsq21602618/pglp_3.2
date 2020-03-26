package fr.uvsq.uvsq21602618.Pglp_3_2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Classe de tests de Employe
 * @author Nathalie
 *
 */
public class TestEmploye {
    /**
     * Test de la méthode CalculSalaire.
     */
	@Test
	public void CalculSalaireEmployeTest() {
		Employe E= new Employe("John SMITH",2015);
		double expected=1600;
		assert (E.calculSalaire()==expected);
	}
}
