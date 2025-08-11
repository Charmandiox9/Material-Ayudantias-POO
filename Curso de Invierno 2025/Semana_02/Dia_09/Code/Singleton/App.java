package Singleton;

public class App {

	public static void main(String[] args) {
		IConfiguracion settings = ConfiguracionImpl.getInstance();
		System.out.println(settings.mostrarConfiguracion());
		settings.establecerIdioma("ES");
		settings.establecerIdioma("FR");
		System.out.println(settings.mostrarConfiguracion());
	}

}
