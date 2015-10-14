package exercicio1;

import java.io.*;

public class Principal {
	public static void main(String[] args) throws IOException {
		String[] lista = new String[200];
		lista = leArquivo();
		double totalImpostoM = 0;
		double totalImpostoF = 0;

		for (int i = 0; i < lista.length; i++) {

			String[] campos = lista[i].split("#");

			Funcionario novoFuncionario = new Funcionario(campos[0],
					campos[1].charAt(0), Double.parseDouble(campos[2]),
					Integer.parseInt(campos[3]));

			if (campos[1].equals("M")) {
				totalImpostoM += novoFuncionario.impostoRenda();
			} else {
				totalImpostoF += novoFuncionario.impostoRenda();
			}

			System.out.println(novoFuncionario.mostraFuncionario() + "\n");
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

	private static String[] leArquivo() throws IOException {
		String[] lista = new String[200];

		FileInputStream fis = new FileInputStream("funcionarios.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		int i = 0;
		
		while (i < 200) {
			lista[i] = br.readLine();
			i++;
		}

		br.close();

		return lista;
	}
}
