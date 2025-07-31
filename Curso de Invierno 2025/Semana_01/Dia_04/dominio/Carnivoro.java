package dominio;

public class Carnivoro extends Animal{

	public Carnivoro(String n, int e, String h, String a) {
		super(n, e, h, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String alimentarse() {
		return "Cazando: " + this.getAlimento();
	}

	@Override
	public String comportamiento() {
		return "Comportamiento: Acecha sigilosamente a su presa";
	}
	
}
