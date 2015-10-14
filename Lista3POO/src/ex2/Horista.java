package ex2;

import java.text.DecimalFormat;

public class Horista extends Funcionario {
	private double quantidadeHoras, valorHora;

	public String getDados() {
		return "Horista - " + getNome() + " " + getSobrenome() + " - "
				+ new DecimalFormat("R$#,###.00").format(getGanhos());
	}

	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getGanhos() {
		return getQuantidadeHoras() * getValorHora();
	}

}
