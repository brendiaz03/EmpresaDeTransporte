package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDeTransporte {
	
	private List<Vehiculo> vehiculos;
	private String nombreEmpresa;
	
	public EmpresaDeTransporte(String nombre) {
		this.nombreEmpresa=nombre;
		this.vehiculos= new ArrayList<>();
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public void agregarUnVehiculo(Vehiculo nuevo) {
		
	}
}
