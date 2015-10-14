import javax.swing.JOptionPane;
public class ex8 {

	public static void main(String[] args) {
		/*Construa um programa que leia um vetor de nove posições e a partir deste vetor, preencha uma
matriz 3x3 com os mesmos valores. O preenchimento da matriz deve ser por linha. Ao final,
imprima o vetor e a matriz gerada*/
		
		int[] vetor = new int[9];
		int[][] matriz= new int[3][3];
		int j = -1;
		String vetorString = JOptionPane.showInputDialog("Entre com 9 números, sem espaço: ");
		
		for(int i = 0; i < 9; i++){
			vetor[i] = Character.getNumericValue(vetorString.charAt(i));
		}
		
		for(int i = 0; i < 9; i++){
			if(i%3==0){
				j++;
			}
			matriz[j][i%3] = vetor[i];
		}
		
		vetorString = "Vetor = \n";
		for(int i = 0; i < 9; i++){
			vetorString += "[" + vetor[i] + "]";
		}
		j=0;
		vetorString += "\nMatriz = \n";
		for(int i = 0; i < 9; i++){
			if(i>0 && i%3==0){
				j++;
				vetorString += "\n";
			}
			vetorString += "[" +matriz[j][i%3] + "]";
		}
		
		JOptionPane.showMessageDialog(null, vetorString);
	}

}
