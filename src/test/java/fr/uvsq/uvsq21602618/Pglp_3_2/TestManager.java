package fr.uvsq.uvsq21602618.Pglp_3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Classe contenant les test de la classe Manager.
 * @author natha
 *
 */
public class TestManager {
    /**
     * Test de la méthode CalculSalaire de Manager.
     */
	@Test
	public void CalculSalaireManagerTest() {
		Manager M= new Manager("John SMITH",2015);
		M.setNbSubalternes(2);
		double expected = 1500 + 200 + 5 * 20;
		assertEquals(expected,M.calculSalaire(),0);
	}
}
