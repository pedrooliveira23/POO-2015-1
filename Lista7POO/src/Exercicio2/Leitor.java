package Exercicio2;

import java.io.*;
import java.util.ArrayList;

public class Leitor implements InterfaceLeitor {

	@Override
	public ArrayList<Cliente> lerArquivos() {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		File dir = new File("Clientes");
		String[] arquivos = dir.list();

		for (String arquivo : arquivos) {

			try {
				FileInputStream fis = new FileInputStream("Clientes/" + arquivo);

				ObjectInputStream ois = new ObjectInputStream(fis);
				clientes.add((Cliente) ois.readObject());
				ois.close();
				fis.close();
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}

}
