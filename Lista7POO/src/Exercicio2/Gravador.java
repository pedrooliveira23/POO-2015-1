package Exercicio2;

import java.io.*;

import javax.swing.JOptionPane;

public class Gravador implements InterfaceGravador {

	@Override
	public void gravarNoArquivo(Cliente cliente) {
		try {
			FileOutputStream fos = new FileOutputStream("Clientes/"
					+ cliente.getNome());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(cliente);

			oos.flush();

			oos.close();

			fos.flush();

			fos.close();
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null,
					"Não foi possivel gravar no arquivo!");
		}
	}

}
