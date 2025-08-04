package dominio;

public class Pez extends Animal{

	public Pez(String n, int e, String r) {
		super(n, e, r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hacerSonido() {
		return "*burbujeo*";
	}

}
