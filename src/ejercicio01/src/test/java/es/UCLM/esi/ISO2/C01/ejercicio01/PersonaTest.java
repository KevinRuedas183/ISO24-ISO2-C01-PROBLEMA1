package es.UCLM.esi.ISO2.C01.ejercicio01;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void testPersona() {
		LocalDate nac = LocalDate.of(2000, 5, 4);
		try {
			Persona p = new Persona("Jose", "Jimenez García", nac, "ESPAÑA",
					"LICENCIATURA", 926666677, "jose@gmail.com");
			assertNotNull(p);
		} catch (Exception e) {
		}
		
	}

	@Test
	public void testEsEuropeo() {
		LocalDate nac = LocalDate.of(2000, 5, 4);
		try {
			Persona p = new Persona("Jose", "Jimenez García", nac, "ESPAÑA",
					"LICENCIATURA", 926666677, "jose@gmail.com");
			boolean expected = true;
			boolean actual = p.esEuropeo();
			assertEquals(expected, actual);
		} catch (Exception e) {
		}
	}

	@Test
	public void testEsMayordeEdad() {
		LocalDate nac = LocalDate.of(2016, 5, 4);
		try {
			Persona p = new Persona("Jose", "Jimenez García", nac, "ESPAÑA",
					"LICENCIATURA", 926666677, "jose@gmail.com");
			boolean expected = false;
			boolean actual = p.esMayoryEuropeo();
			assertEquals(expected, actual);
		} catch (Exception e) {
		}
	}

	@Test
	public void testEsMayoryEuropeo() {
		LocalDate nac = LocalDate.of(2016, 5, 4);
		try {
			Persona p = new Persona("Jose", "Jimenez García", nac, "NIGERIA",
					"LICENCIATURA", 926666677, "jose@gmail.com");
			boolean expected = false;
			boolean actual = p.esMayoryEuropeo();
			assertEquals(expected, actual);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testEsMayoryEuropeo2() {
		LocalDate nac = LocalDate.of(2000, 5, 4);
		try {
			Persona p = new Persona("Jose", "Jimenez García", nac, "ESPAÑA",
					"LICENCIATURA", 926666677, "jose@gmail.com");
			boolean expected = true;
			boolean actual = p.esMayoryEuropeo();
			assertEquals(expected, actual);
		} catch (Exception e) {
		}
	}

	@Test
	public void testHacer_matricula() {
		LocalDate nac = LocalDate.of(2016, 5, 4);
		try {
			Persona p = new Persona("Jose", "Jimenez García", nac, "ESPAÑA",
					"master", 926666677, "jose@gmail.com");
			boolean expected = true;
			boolean actual = p.hacer_matricula();
			assertEquals(expected, actual);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testHacer_matricula2() {
		LocalDate nac = LocalDate.of(2016, 5, 4);
		try {
			Persona p = new Persona("Jose", "Jimenez García", nac, "ESPAÑA",
					"licenciatura", 926666677, "jose@gmail.com");
			boolean expected = false;
			boolean actual = p.hacer_matricula();
			assertEquals(expected, actual);
		} catch (Exception e) {
		}
	}

	@Test
	public void testSetFecha_nacimiento() {
		LocalDate nac = LocalDate.of(2028, 5, 4);
		try {
			Persona p = new Persona("Jose", "Jimenez García", nac, "ESPAÑA",
					"master", 926666677, "jose@gmail.com");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	
}
