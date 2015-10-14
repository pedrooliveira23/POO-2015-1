package Exercicio2;

import java.awt.GridLayout;

import javax.swing.*;

public class Painel extends JPanel {
	private JTextField nome = new JTextField(5);
	private JTextField sexo = new JTextField(1);
	private JTextField dia = new JTextField(2);
	private JTextField mes = new JTextField(2);
	private JTextField ano = new JTextField(4);

	Painel() {
		setLayout(new GridLayout(0,2));
		add(new JLabel("Nome:"));
		add(nome);
		add(new JLabel("Sexo (M - F):"));
		add(sexo);
		add(new JLabel("Dia de Nascimento:"));
		add(dia);
		add(new JLabel("Mes de Nascimento:"));
		add(mes);
		add(new JLabel("Ano de Nascimento:"));
		add(ano);
	}
	
	public String getNome() {
		return nome.getText();
	}
	
	public char getSexo() {
		return sexo.getText().charAt(0);
	}
	
	public int getDia() throws NumberFormatException {
		return Integer.parseInt(dia.getText());
	}
	
	public int getMes() throws NumberFormatException {
		return Integer.parseInt(mes.getText());
	}
	
	public int getAno() throws NumberFormatException {
		return Integer.parseInt(ano.getText());
	}
	
	public void limpaCampos() {
		nome.setText(null);
		sexo.setText(null);
		dia.setText(null);
		mes.setText(null);
		ano.setText(null);
	}
}
