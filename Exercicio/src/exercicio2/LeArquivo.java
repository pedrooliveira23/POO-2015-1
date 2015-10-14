package exercicio2;

import java.io.*;

public class LeArquivo {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Funcionario[] lista = new Funcionario[200];
		lista = leArquivo();
		double totalImpostoM = 0;
		double totalImpostoF = 0;

		for (int i = 0; i < lista.length; i++) {

			if (lista[i].sexo == 'M') {
				totalImpostoM += lista[i].impostoRenda();
			} else {
				totalImpostoF += lista[i].impostoRenda();
			}

			System.out.println(lista[i].mostraFuncionario() + "\n");
		}

		System.out
				.println("\n\nTotal Imposto pago por Funcionários Masculinos: R$ "
						+ totalImpostoM);
		System.out
				.println("\nTotal Imposto pago por Funcionários Femininos: R$ "
						+ totalImpostoF);
		System.out
				.println("\nTotal Imposto pago por todos os Funcionários: R$ "
						+ (totalImpostoM + totalImpostoF));
	}

	private static Funcionario[] leArquivo() throws IOException,
			ClassNotFoundException {
		Funcionario[] lista = new Funcionario[200];

		int i = 0;

		while (i < 200) {
			FileInputStream fis = new FileInputStream(
					"funcionarios/funcionarios" + i + ".dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Funcionario novoFuncionario = (Funcionario) ois.readObject();
			lista[i] = novoFuncionario;
			i++;
			ois.close();
		}

		return lista;
	}
}
