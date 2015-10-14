package br.com.microsisinformatica.backend;

import java.io.Serializable;

public class Veiculo implements Serializable {
	private String motorista, tipo, placa;
	
	Veiculo(String motorista, String tipo, String placa) {
		this.motorista = motorista;
		this.tipo = tipo;
		this.placa = placa;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String toString() {
		return placa + " | " + tipo + " | " + motorista + "\n";
	}

}
