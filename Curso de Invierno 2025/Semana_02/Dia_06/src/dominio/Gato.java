package dominio;

public class Gato extends Animal{

	public Gato(String n, int e, String r) {
		super(n, e, r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hacerSonido() {
		return "Miau miau";
	}

}
