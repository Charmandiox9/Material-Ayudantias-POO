package Singleton;

public class ConfiguracionImpl implements IConfiguracion{
	private static ConfiguracionImpl instancia;
	private String idioma;
	private String tema;
	private String nivelLogging;
	
	private ConfiguracionImpl() {idioma = "ES"; tema = "OSCURO"; nivelLogging = "INFO";}
	
	public static ConfiguracionImpl getInstance() {
		if(instancia == null) {
			instancia = new ConfiguracionImpl();
		}
		return instancia;
	}
	

	@Override
	public void establecerIdioma(String idioma) {
		if(!this.idioma.equals(idioma)) {
			this.idioma = idioma;
		} else {
			System.out.println("Ya se ha establecido esta configuración.");
		}
	}

	@Override
	public void establecerTema(String tema) {
		if(!this.tema.equals(tema)) {
			this.tema = tema;
		} else {
			System.out.println("Ya se ha establecido esta configuración.");
		}
	}

	@Override
	public void establecerNivelLogging(String nivel) {
		if(!this.nivelLogging.equals(nivel)) {
			this.nivelLogging = nivel;
		} else {
			System.out.println("Ya se ha establecido esta configuración.");
		}
	}

	@Override
	public String mostrarConfiguracion() {
		return "Idioma: " + idioma + "\nTema: " + tema + "\nNivel de logging: " + nivelLogging;
	}

}
