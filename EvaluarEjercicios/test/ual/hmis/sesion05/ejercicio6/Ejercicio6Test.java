package ual.hmis.sesion05.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ual.hmis.asignatura.*;

class Ejercicio6Test {

	@Test
	void test() {
		Alumno a = new Alumno();
		String nota1 = a.calificacion(0);
		String nota2 = a.calificacion(5);
		String nota3 = a.calificacion(7);
		String nota4 = a.calificacion(9);
		String nota5 = a.calificacion(10);
		String nota6 = a.calificacion(12);
		
		assertTrue(nota1=="Suspenso");
		assertTrue(nota2=="Aprobado");
		assertTrue(nota3=="Notable");
		assertTrue(nota4=="Sobresaliente");
		assertTrue(nota5=="Matrícula");
		assertTrue(nota6=="Error en la nota");
	}

}
