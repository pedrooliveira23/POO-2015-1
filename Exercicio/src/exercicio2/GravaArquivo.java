package exercicio2;

import java.io.*;

public class GravaArquivo {
	public static void main(String[] args) throws IOException {
		String[] lista = new String[200];
		lista = leArquivo();

		for (int i = 0; i < lista.length; i++) {

			String[] campos = lista[i].split("#");

			Funcionario novoFuncionario = new Funcionario(campos[0],
					campos[1].charAt(0), Double.parseDouble(campos[2]),
					Integer.parseInt(campos[3]));
			
			gravaArquivo(novoFuncionario, i);
			
		}
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
	
	private static void gravaArquivo(Funcionario funcionario, int i) throws IOException {
		FileOutputStream fos = new FileOutputStream("funcionarios/funcionarios"+ i +".dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(funcionario);
		oos.close();
	}
}
