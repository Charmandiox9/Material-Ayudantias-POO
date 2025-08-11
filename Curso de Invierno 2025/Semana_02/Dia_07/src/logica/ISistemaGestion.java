package logica;

import java.util.ArrayList;

import dominio.Vehiculo;

public interface ISistemaGestion {
	boolean agregarVehiculo(Vehiculo v);
	ArrayList<Vehiculo> listarVehiculos();
	ArrayList<Vehiculo> listarDisponibles();
	boolean alquilarVehiculo(String matricula, int dias);
	boolean devolverVehiculo(String matricula);
	
}
