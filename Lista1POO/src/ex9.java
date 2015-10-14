import javax.swing.JOptionPane;

import java.util.Arrays;
public class ex9 {

	public static void main(String[] args) {
		int dimensao = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero de linhas e colunas (matriz quadrada): "));
		int[][] matrizA = new int[dimensao][dimensao];
		int[][] matrizB = new int[dimensao][dimensao];
		int[][] matrizSoma = new int[dimensao][dimensao];
		String matriz = "";
		
		matriz = populaA(dimensao, matriz, matrizA);
		matriz =populaB(dimensao, matriz, matrizB);
		somaMatrizes(dimensao, matrizA, matrizB, matrizSoma);
		matriz = mostraSoma(dimensao, matrizSoma, matriz);
		
		JOptionPane.showMessageDialog(null,matriz);
	}

	private static String mostraSoma(int dimensao, int[][] matrizSoma, String matriz) {
		int j=0;
		
		matriz = "A soma das matrizes é: \n";
		
		for(int i = 0; i < dimensao*dimensao; i++){
			if(i>0 && i%dimensao==0){
				matriz+="\n";
				j++;
			}
			matriz+="[" +matrizSoma[j][i%dimensao]+ "]";
		}
		
		return matriz;
	}

	private static void somaMatrizes(int dimensao, int[][] matrizA,
			int[][] matrizB, int[][] matrizSoma) {
		
		int j=-1;
		
		for(int i = 0; i < dimensao*dimensao; i++){
			if(i%dimensao==0){
				j++;
			}
			matrizSoma[j][i%dimensao] = matrizA[j][i%dimensao] + matrizB[j][i%dimensao];
		}
		
	}

	private static String populaB(int dimensao, String matriz, int[][] matrizB) {
		int j = -1;
		
		for(int i= 0; i < dimensao; i++){
			matriz += JOptionPane.showInputDialog(
					"Entre com a "+(i+1)+"a linha da matriz B: \n"+matriz
					);
			matriz+="\n";
		}
		
		matriz = matriz.replace("\n", "");
		j=-1;
		for(int i = 0; i < dimensao*dimensao; i++){
			if(i%dimensao==0){
				j++;
			}
			matrizB[j][i%dimensao] = Character.getNumericValue(matriz.charAt(i));
		}
		
		return matriz;
	}

	private static String populaA(int dimensao, String matriz, int[][] matrizA) {
		int j = -1;
		
		for(int i= 0; i < dimensao; i++){
			matriz += JOptionPane.showInputDialog(
					"Entre com a "+(i+1)+"a linha da matriz A: \n"+matriz
					);
			matriz+="\n";
		}
		
		matriz = matriz.replace("\n", "");
		
		for(int i = 0; i < dimensao*dimensao; i++){
			if(i%dimensao==0){
				j++;
			}
			matrizA[j][i%dimensao] = Character.getNumericValue(matriz.charAt(i));
		}
		
		return matriz = "";
		
	}

}
