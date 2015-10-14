import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[5][7];
		int maior;
		int[] posicao = new int[2];
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Entre com o elemento[0][0] = ");
		matriz[0][0] = scn.nextInt();
		maior = matriz[0][0];
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 7; j++){
				if(i == 0 && j== 0){
					j++;
				}
				System.out.println("Entre com o elemento["+i+"]["+j+"] = ");
				matriz[i][j] = scn.nextInt();
				if(matriz[i][j] > maior){
					maior = matriz [i][j];
					posicao[0] = i;
					posicao[1] = j;
				}
			}
		}
		
		System.out.println("Matriz: ");
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 7; j++){
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println("");
		}
		
		System.out.println("\nMaior["+posicao[0]+"]["+posicao[1]+"] = "+maior);

	}

}
