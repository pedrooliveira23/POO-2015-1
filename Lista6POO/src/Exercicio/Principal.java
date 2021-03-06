package Exercicio;

import java.util.ArrayList;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Painel painel = new Painel();
		
		 int resultado = JOptionPane.showConfirmDialog(null, painel, 
	               "Cadastrar novo cliente", JOptionPane.OK_CANCEL_OPTION);
		 do {
			 if(resultado != JOptionPane.CANCEL_OPTION) {
				 try {
					 if(painel.getSexo() == 'M' || painel.getSexo() == 'F') {
						 clientes.add(new Cliente(painel.getNome(), painel.getSexo(), painel.getDia(), painel.getMes(), painel.getAno()));
					 } else {
						 throw new ExcecaoSexoInvalido();
					 }
				 } catch (NumberFormatException ex) {
					 JOptionPane.showMessageDialog(null, "Entrada inválida nos campos de dia, mes ou ano.");
				 } catch (ExcecaoSexoInvalido ex2) {
					 JOptionPane.showMessageDialog(null, ex2.getMessage());
				 } catch (StringIndexOutOfBoundsException ex3) {
					 JOptionPane.showMessageDialog(null, "Entradas inválidas!");
				 }
				 
				 painel.limpaCampos();
				 
				 resultado = JOptionPane.showConfirmDialog(null, painel, 
			               "Cadastrar novo cliente", JOptionPane.OK_CANCEL_OPTION);
			 }			 
		 } while(resultado != JOptionPane.CANCEL_OPTION);

	}
}
