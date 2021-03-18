package ual.hmis.sesion05.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ual.hmis.asignatura.*;

class Ejercicio5Test {

	@Test
	void test() {
		
		Ejercicio ej1 = new Ejercicio();
		Actividad ac1 = new Actividad();
		ArrayList<Ejercicio> arrayEj1 = new ArrayList<Ejercicio>();
		Alumno alumno = new Alumno();
		ArrayList<Actividad> arrayAc = new ArrayList<Actividad>();
		
		ej1.setPuntuacion(2);
		
		arrayEj1.add(ej1);
		
		ac1.setNombre("ac1");
		ac1.setEjercicios(arrayEj1);
		
		arrayAc.add(ac1);
		
		alumno.setActividadesAsignadas(arrayAc);
		
		double resultado1 = alumno.calcularNotaActividad("ac1");
		double resultado3 = alumno.calcularNotaActividad("ac4");
		
		assertTrue(resultado1 == 2);
		assertTrue(ac1.getPuntuacionTotal() == 2);
		
		assertTrue(resultado3 == 0);		
		
	}

}
