package Exercicio;

import java.util.Calendar;

public class Cliente implements InterfaceCliente {
	private String nome;
	private char sexo;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	private int idade;
	
	Cliente(String nome, char sexo, int diaNascimento, int mesNascimento, int anoNascimento) {
		this.nome = nome;
		this.sexo = sexo;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public char getSexo() {
		// TODO Auto-generated method stub
		return sexo;
	}

	@Override
	public int getDiaNascimento() {
		// TODO Auto-generated method stub
		return diaNascimento;
	}

	@Override
	public int getMesNascimento() {
		// TODO Auto-generated method stub
		return mesNascimento;
	}

	@Override
	public int getAnoNascimento() {
		// TODO Auto-generated method stub
		return anoNascimento;
	}

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return idade;
	}

	private void setIdade() {
		Calendar hoje = Calendar.getInstance();
		idade = ((hoje.get(Calendar.DAY_OF_MONTH)) / 365)
				+ (hoje.get(Calendar.MONTH) / 12)
				+ (hoje.get(Calendar.YEAR))
				- ((diaNascimento / 365) + (mesNascimento / 12) + (anoNascimento));
	}

}
