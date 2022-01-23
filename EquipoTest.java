import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author bilal
 *
 */
class EquipoTest {

	/**
	 * TC01 - Nombre (Numero Caracteres Negativo).Introduciremos un número  negativo en el campo de nombre, por lo
	 * .  que el test debe dar error.
	 */
	@Test
	void testSetNombreEquipo() {
		Equipo equ=new Equipo();
		equ.setNombreEquipo(null);
		assertEquals(-100,equ.getNombreEquipo());
		
		fail("No se pueden introducir caracteres númericos para el nombre");
	}
	
	/**
	 * TC07 - Nombre (Numero Caracteres Numéricos).Introduciremos un número en el campo de nombre, por lo que el test 
	 * debe dar error.
	 * .
	 */
	@Test
	void testSetNombreEquipo2() {
		Equipo equ=new Equipo();
		equ.setNombreEquipo(null);
		assertEquals(34,equ.getNombreEquipo());
		
		fail("No se pueden introducir caracteres númericos para el nombre");
	}
	/**
	 * Test method for {@link Equipo#setRanking(int)}.
	 */
	@Test
	void testSetRanking() {
		fail("Not yet implemented");
	}

}
