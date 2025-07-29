package ej3;

public class Inscripcion {
	private String nrc;
	private String nombreEstudiante;
	private int edad;
	private double promedio;
	
	
	public Inscripcion(String nrc, String nombreEstudiante, int edad, double promedio) {
		this.nrc = nrc;
		this.nombreEstudiante = nombreEstudiante;
		this.edad = edad;
		this.promedio = promedio;
	}


	public String getNrc() {
		return nrc;
	}


	public void setNrc(String nrc) {
		this.nrc = nrc;
	}


	public String getNombreEstudiante() {
		return nombreEstudiante;
	}


	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getPromedio() {
		return promedio;
	}


	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}


	@Override
	public String toString() {
		return "- " + nombreEstudiante + " (" + edad + " años) - Promedio: "
				+ promedio;
	}
	
	
	
}
