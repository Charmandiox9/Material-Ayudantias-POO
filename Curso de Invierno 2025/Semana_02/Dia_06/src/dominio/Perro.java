package dominio;

public class Perro extends Animal{

	public Perro(String n, int e, String r) {
		super(n, e, r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hacerSonido() {
		return "Guau guau";
	}

}
