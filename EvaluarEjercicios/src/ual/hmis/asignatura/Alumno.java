package ual.hmis.asignatura;

import java.util.ArrayList;
import java.util.*;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		double nota = 0.0;
		Actividad b;
		
		for (int i=0;i<actividadesAsignadas.size();i++) {
			b = actividadesAsignadas.get(i);
			if (b.getNombre() == nombreActividad) {
				for (int j=0;j<b.getEjercicios().size();j++) {
					nota += b.getEjercicios().get(j).getPuntuacion();
				}
				nota /= b.getEjercicios().size();
				b.setPuntuacionTotal(nota);
				break;
			}
		}
		return nota;
	}
	
	public String calificacion (double nota) {
		if (nota<=4.9) return "Suspenso";
		else if (nota <= 6.9) return "Aprobado";
		else if (nota <= 8.9) return "Notable";
		else if (nota <= 9.9) return "Sobresaliente";
		else if (nota == 10) return "Matrícula";
		else return "Error en la nota";
	}
	
	public String cursoSegunEdad (int anyoNacimiento) {
		switch(anyoNacimiento) {
		case 2005:
			return "4 Educación Secundaria";
		case 2006:
			return "3 Educación Secundaria";
		case 2007:
			return "2 Educación Secundaria";
		case 2008:
			return "1 Educación Secundaria";
		case 2009:
			return "6 Educación Primaria";
		case 2010:
			return "5 Educación Primaria";
		case 2011:
			return "4 Educación Primaria";
		case 2012:
			return "3 Educación Primaria";
		case 2013:
			return "2 Educación Primaria";
		case 2014:
			return "1 Educación Primaria";
		case 2015:
			return "3 Educación Infantil";
		case 2016:
			return "2 Educación Infantil";
		case 2017:
			return "1 Educación Infantil";
		default:
			return "No es un anyo válido";
			
		}
		
	}

}
