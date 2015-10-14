package ex2;

import java.text.DecimalFormat;

public class Comissionado extends Funcionario {
	private double salario, comissao, totalVendas;
	
	public String getDados() {
		return "Comissionado - " + getNome() + " " + getSobrenome() + " - "
				+ new DecimalFormat("R$#,###.00").format(getGanhos()); 
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	public double getGanhos() {
		return getSalario() + (getTotalVendas()*getComissao()/100);
	}
}
