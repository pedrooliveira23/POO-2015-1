package ex2;

import java.text.DecimalFormat;

public class Administrador extends Funcionario {
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getDados() {
		return "Administrador - " + getNome() + " " + getSobrenome() + " - "
				+ new DecimalFormat("R$#,###.00").format(getSalario()); 
	}

}
