package fr.uvsq.uvsq21602618.Pglp_3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestManager {

	@Test
	public void CalculSalaireManagerTest() {
		Manager M= new Manager("John SMITH",2015);
		M.setNbSubalternes(2);
		double expected=1800;
		assertEquals(expected,M.calculSalaire(),0);
	}
}
