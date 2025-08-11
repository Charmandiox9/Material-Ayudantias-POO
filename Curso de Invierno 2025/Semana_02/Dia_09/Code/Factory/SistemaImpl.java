package Factory;

import java.util.ArrayList;

public class SistemaImpl implements ISistema{
	private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	@Override
	public boolean crearAutomovil(String marca, String modelo) {
		Vehiculo v = VehiculosFactory.crearVehiculo("automovil", marca, modelo);
		if(v != null) {
			vehiculos.add(v);
			return true;
		}
		return false;
	}

	@Override
	public boolean crearMotocicleta(String marca, String modelo) {
		Vehiculo v = VehiculosFactory.crearVehiculo("motocicleta", marca, modelo);
		if(v != null) {
			vehiculos.add(v);
			return true;
		}
		return false;
	}

	@Override
	public boolean crearBicicleta(String marca, String modelo) {
		Vehiculo v = VehiculosFactory.crearVehiculo("bicicleta", marca, modelo);
		if(v != null) {
			vehiculos.add(v);
			return true;
		}
		return false;
	}

	@Override
	public void mostrarVehiculos() {
		for(Vehiculo v: vehiculos) {
			v.mostrarInformacion();
			System.out.println();
		}
	}

}
