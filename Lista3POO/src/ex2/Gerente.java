package ex2;

import java.text.DecimalFormat;

public class Gerente extends Funcionario {
	private double salario, bonificacao;

	public String getDados() {
		return "Gerente - " + getNome() + " " + getSobrenome() + " - "
				+ new DecimalFormat("R$#,###.00").format(getGanhos());
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getGanhos() {
		return getSalario() + getBonificacao();
	}
}
