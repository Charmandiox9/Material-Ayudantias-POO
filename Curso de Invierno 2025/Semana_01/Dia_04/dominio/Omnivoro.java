package dominio;

public class Omnivoro extends Animal {

	public Omnivoro(String n, int e, String h, String a) {
		super(n, e, h, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String alimentarse() {
		return "Alimentándose: " + this.getAlimento();
	}

	@Override
	public String comportamiento() {
		return "Comportamiento: Busca alimento variado en su territorio";
	}

}
