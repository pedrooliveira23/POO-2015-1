package br.com.microsisinformatica.backend;

import java.util.ArrayList;

public interface InterfaceTabela {
	public void inserir(String placa, String tipo, String motorista);
	public int pesquisar(String placa);
	public void editar(String placa, String tipo, String motorista, int index);
	public void remover(int index, String placa);
	public void popular(ArrayList<Veiculo> veiculos);
}
