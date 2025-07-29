package ej2;

public class CitaMedica {
	private String nombrePaciente;
	private String nombreDoctor;
	private String hora;
	private String tipoConsulta;
	
	public CitaMedica(String np, String nd, String h, String tp) {
		this.nombrePaciente = np;
		this.nombreDoctor = nd;
		this.hora = h;
		this.tipoConsulta = tp;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getNombreDoctor() {
		return nombreDoctor;
	}

	public void setNombreDoctor(String nombreDoctor) {
		this.nombreDoctor = nombreDoctor;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	@Override
	public String toString() {
		return "Paciente: " + nombrePaciente + "\nMédico: " + nombreDoctor + "\nHora: " + hora
				+ "\nEspecialidad: " + tipoConsulta;
	}
	
	
}
