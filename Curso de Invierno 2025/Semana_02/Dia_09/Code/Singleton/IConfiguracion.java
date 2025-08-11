package Singleton;

public interface IConfiguracion {
	public void establecerIdioma(String idioma);
	public void establecerTema(String tema);
	public void establecerNivelLogging(String nivel);
	public String mostrarConfiguracion();
}
