import javax.swing.JOptionPane;
import java.util.Arrays;
public class ex6 {

	public static void main(String[] args) {
		/*Construa um algoritmo que gere um vetor de 50 elementos reais, da seguinte forma: a primeira
e a última posições com o valor 100 e as demais posições do vetor deverão ser preenchidas com
a soma do quadrado do índice do elemento anterior e a raiz quadrada do índice do elemento
seguinte.
 Ao final imprima o vetor gerado. Os elementos serão: 100, 02+2 , 123 , 224 ,...,
100.*/
		
		double[] vetor = new double[50];
		Arrays.fill(vetor, 100);
		String vetorString = "Os elementos são: \n"+vetor[0]+", ";
		for(int i = 1; i<49;i++){
			vetor[i] = Math.pow(i-1,2) + Math.pow(i+1,(1/2));
			if(i%5 == 0){
				vetorString += "\n";
			}
			vetorString += vetor[i] + ", ";
		}
		vetorString += vetor[49];
		JOptionPane.showMessageDialog(null, vetorString);

	}

}
