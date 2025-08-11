package Visitor;

import java.util.ArrayList;

public class CalculadoraFormas {
	private ArrayList<Forma> formas = new ArrayList<>();
	
	public void agregarForma(Forma forma) {
		formas.add(forma);
	}
	
	public void calcularArea() {
		for(Forma f: formas) {
			CalculadorArea c = new CalculadorArea();
			f.aceptar(c);
			System.out.println("Area de " + f.getClass().getSimpleName() + ": " + c.getTotalArea());
			System.out.println();
		}
	}
	
	public void calcularPerimetros() {
		for(Forma f: formas) {
			CalculadorPerimetro c = new CalculadorPerimetro();
			f.aceptar(c);
			System.out.println("Area de " + f.getClass().getSimpleName() + ": " + c.getTotalPerimetro());
			System.out.println();
		}
	}
	
}
