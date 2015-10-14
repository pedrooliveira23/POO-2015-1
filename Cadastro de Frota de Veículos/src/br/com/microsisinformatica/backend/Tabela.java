package br.com.microsisinformatica.backend;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabela extends JTable implements InterfaceTabela {
	private DefaultTableModel modelo;
	private OperadorVeiculo oVeiculos = new OperadorVeiculo();

	public Tabela() {
		modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new String[] { "Placa", "Tipo", "Motorista" });
		setModel(modelo);
		popular(oVeiculos.listar());
	}

	@Override
	public void inserir(String placa, String tipo, String motorista) {
		oVeiculos.add(new Veiculo(motorista, tipo, placa));
		modelo.addRow(new String[] { placa, tipo, motorista });
		setModel(modelo);
	}

	@Override
	public int pesquisar(String placa) {
		for(int i = 0; i < oVeiculos.listar().size(); i++) {
			if(oVeiculos.listar().get(i).getPlaca().equals(placa)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void editar(String placa, String tipo, String motorista, int index) {
		oVeiculos.remove(index, placa);
		oVeiculos.add(new Veiculo(motorista, tipo, placa));
		setValueAt(placa, index, 0);
		setValueAt(tipo, index, 1);
		setValueAt(motorista, index, 2);
	}

	@Override
	public void remover(int index, String placa) {
		oVeiculos.remove(index, placa);
		modelo.removeTableModelListener(this);
		modelo.removeRow(index);
		modelo.addTableModelListener(this);
	}

	@Override
	public void popular(ArrayList<Veiculo> veiculos) {
		for (Veiculo veiculo : veiculos) {
			modelo.addRow(new String[] { veiculo.getPlaca(), veiculo.getTipo(),
					veiculo.getMotorista() });
		}

	}
}
