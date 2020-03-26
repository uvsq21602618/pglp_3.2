package fr.uvsq.uvsq21602618.Pglp_3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Classe contenant les tests de la classe Vendeur.
 * @author natha
 *
 */
public class TestVendeur {
    /**
     * Test de la méthode CalculSalaire de Vendeur.
     */
	@Test
	public void CalculSalaireVendeurTest() {
		Vendeur V= new Vendeur("John SMITH",2015);
		V.setCommission(150.5);
		double expected=1750.5;
		assertEquals(expected,V.calculSalaire(),0);
	}
}
