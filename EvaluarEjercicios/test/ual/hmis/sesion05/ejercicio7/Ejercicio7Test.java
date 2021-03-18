package ual.hmis.sesion05.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import ual.hmis.asignatura.*;

import org.junit.jupiter.api.Test;

class Ejercicio7Test {

	@Test
	void test() {
		Alumno al = new Alumno();
		String[] cursos = {"4 Educación Secundaria","3 Educación Secundaria","2 Educación Secundaria","1 Educación Secundaria",
				"6 Educación Primaria","5 Educación Primaria","4 Educación Primaria","3 Educación Primaria","2 Educación Primaria",
				"1 Educación Primaria","3 Educación Infantil","2 Educación Infantil","1 Educación Infantil","No es un anyo válido"};
		String curso;
		int indice = 0;
		for (int i = 2005;i<=2018;i++) {
			curso = al.cursoSegunEdad(i);
			assertTrue(curso == cursos[indice]);
			indice++;
		}
		
	}

}
