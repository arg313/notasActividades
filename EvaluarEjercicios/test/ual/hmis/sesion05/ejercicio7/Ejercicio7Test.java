package ual.hmis.sesion05.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import ual.hmis.asignatura.*;

import org.junit.jupiter.api.Test;

class Ejercicio7Test {

	@Test
	void test() {
		Alumno al = new Alumno();
		String[] cursos = {"4 Educaci�n Secundaria","3 Educaci�n Secundaria","2 Educaci�n Secundaria","1 Educaci�n Secundaria",
				"6 Educaci�n Primaria","5 Educaci�n Primaria","4 Educaci�n Primaria","3 Educaci�n Primaria","2 Educaci�n Primaria",
				"1 Educaci�n Primaria","3 Educaci�n Infantil","2 Educaci�n Infantil","1 Educaci�n Infantil","No es un anyo v�lido"};
		String curso;
		int indice = 0;
		for (int i = 2005;i<=2018;i++) {
			curso = al.cursoSegunEdad(i);
			assertTrue(curso == cursos[indice]);
			indice++;
		}
		
	}

}
