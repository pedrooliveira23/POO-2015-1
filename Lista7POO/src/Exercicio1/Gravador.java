package Exercicio1;

import java.io.*;

import javax.swing.JOptionPane;

public class Gravador implements InterfaceGravador {

	@Override
	public void gravarNoArquivo(Cliente cliente) {
		try {
			File file = new File("clientes.txt");

			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(cliente.getNome() + " - " + cliente.getSexo() + " - "
					+ cliente.getIdade());
			pw.close();
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null,
					"Não foi possivel gravar no arquivo!");
		}
	}

}
