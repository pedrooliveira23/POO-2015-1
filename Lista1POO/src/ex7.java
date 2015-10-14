import javax.swing.JOptionPane;
public class ex7 {

	public static void main(String[] args) {		
		int[] vetor = new int[9];
		String vetorString = JOptionPane.showInputDialog("Entre com 9 numeros, sem espaço:");
		
		for(int i = 0; i < 9; i++){
			vetor[i] = Character.getNumericValue(vetorString.charAt(i));
		}
		vetorString="Ímpares:\n";
		for(int i = 0; i < 9; i++){
			if(vetor[i]%2!=0){
				vetorString+="vetor["+i+"] = "+vetor[i]+"\n";
			}
		}
		
		JOptionPane.showMessageDialog(null,vetorString);
		
	}

}
