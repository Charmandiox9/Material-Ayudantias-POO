package dominio;

public class Herbivoro extends Animal{

	public Herbivoro(String n, int e, String h, String a) {
		super(n, e, h, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String alimentarse() {
		return "Alimentándose: " + this.getAlimento();
	}

	@Override
	public String comportamiento() {
		return "Comportamiento: Mordisquea plantas cerca de su madriguera";
	}
	
}
