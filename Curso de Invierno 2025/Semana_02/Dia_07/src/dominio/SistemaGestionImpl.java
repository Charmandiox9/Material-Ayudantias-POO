package dominio;

import java.util.ArrayList;

import logica.ISistemaGestion;

public class SistemaGestionImpl implements ISistemaGestion {
	
	private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	@Override
	public boolean agregarVehiculo(Vehiculo v) {
		boolean agregado = false;
		
		if(validarMatricula(v.getMatricula())) {
			vehiculos.add(v);
			agregado = true;
		}
		return agregado;
	}
	
	public boolean validarMatricula(String matricula) {
		boolean encontrado = false;
		
		for(Vehiculo v: vehiculos) {
			if(v.getMatricula().equals(matricula)) {
				encontrado = true;
			}
		}
		
		
		if(!encontrado) {
			return true;
		}
		
		return false;
	}

	@Override
	public ArrayList<Vehiculo> listarVehiculos() {
		ArrayList<Vehiculo> vehiculoss = new ArrayList<>();
		
		for(Vehiculo v: vehiculos) {
			vehiculoss.add(v);
		}
		
		return vehiculoss;
	}

	@Override
	public ArrayList<Vehiculo> listarDisponibles() {
		ArrayList<Vehiculo> disponibles = new ArrayList<>();
		
		for(Vehiculo v: vehiculos) {
			if(v.estaDisponible()) {
				disponibles.add(v);
			}
		}
		
		return disponibles;
	}

	@Override
	public boolean alquilarVehiculo(String matricula, int dias) {
		boolean alquilado = false;
		
		for(Vehiculo v: vehiculos) {
			if(v.getMatricula().equals(matricula) && v.estaDisponible()) {
				v.alquilar();
				System.out.println("Has alquilado el vehiculo " + matricula + " por " + dias + " días, por un total de " + v.calcularCostoAlquiler(dias));
				alquilado = true;
				break;
			}
		}
		return alquilado;
	}

	@Override
	public boolean devolverVehiculo(String matricula) {
		boolean devuelto = false;
		
		for(Vehiculo v: vehiculos) {
			if(v.getMatricula().equals(matricula) && !v.estaDisponible()) {
				v.devolver();
				System.out.println("Has devuelto el vehiculo " + matricula);
				devuelto = true;
				break;
			}
		}
		return devuelto;
	}

}
