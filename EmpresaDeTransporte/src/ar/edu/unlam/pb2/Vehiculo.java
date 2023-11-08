package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
	
	private Integer patente;
	private Integer cantidadMaxDePasajeros;
	private Double cantidadKM;
	protected List<Persona> pasajeros;
	private Chofer chofer;
	
	public Vehiculo(Integer patente,Double cantidadKM ,Integer cantidadMaximaDePasajeros) {
		this.patente = patente;
		this.cantidadKM = cantidadKM;
		this.cantidadMaxDePasajeros = cantidadMaximaDePasajeros;
		this.pasajeros = new ArrayList<>();
	}

	public Integer getPatente() {
		return patente;
	}

	public void setPatente(Integer patente) {
		this.patente = patente;
	}

	public Double getCantidadKM() {
		return cantidadKM;
	}

	public void setCantidadKM(Double cantidadKM) {
		this.cantidadKM = cantidadKM;
	}

	public Integer getCantidadMaxDePasajeros() {
		return cantidadMaxDePasajeros;
	}

	public void setCantidadMaxDePasajeros(Integer cantidadMaxDePasajeros) {
		this.cantidadMaxDePasajeros = cantidadMaxDePasajeros;
	}
	
	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}

	public Boolean asignarChofer(Chofer nuevo) throws ChoferNullException{
		if(nuevo.equals(null)) {
			ChoferNullException e = new ChoferNullException();
			throw e;
		}else {
			setChofer(nuevo);
			return true;
		}
	};
	
	public Boolean cambiarDeChofer(Chofer nuevo) throws ChoferNullException {
		if(nuevo.equals(null)) {
			ChoferNullException e = new ChoferNullException();
			throw e;
		}
		if(this.pasajeros.equals(null)) {
			setChofer(nuevo);
			return true;
		}else {

			return false;
		}
	};

	public Boolean ingresarPasajero(Persona nueva) {
		if(nueva.equals(null)) {
			PasajerosNullException e = new PasajerosNullException();
			throw e;
		}
		if(this.getCantidadMaxDePasajeros().equals(getPasajeros().size()+1)){
			return false;
		}else {
			pasajeros.add(nueva);
			return true;
		}
	};
	
}
