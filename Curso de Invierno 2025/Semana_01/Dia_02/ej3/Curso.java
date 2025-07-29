package ej3;

public class Curso {
	private String nombreAsignatura;
	private String nrc;
	private String nombreProfesor;
	
	
	public Curso(String nombreAsignatura, String nrc, String nombreProfesor) {
		this.nombreAsignatura = nombreAsignatura;
		this.nrc = nrc;
		this.nombreProfesor = nombreProfesor;
	}


	public String getNombreAsignatura() {
		return nombreAsignatura;
	}


	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}


	public String getNrc() {
		return nrc;
	}


	public void setNrc(String nrc) {
		this.nrc = nrc;
	}


	public String getNombreProfesor() {
		return nombreProfesor;
	}


	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}


	@Override
	public String toString() {
		return "Curso: " + nombreAsignatura + " (" + nrc + ") \nProfesor: " + nombreProfesor;
	}
	
}
