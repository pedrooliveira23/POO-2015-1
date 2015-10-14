package Jogo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int numeroJogadores = Integer
				.parseInt(JOptionPane
						.showInputDialog("Entre com o numero de jogadores (x > 1 e x < 17):"));

		while (numeroJogadores > 16 || numeroJogadores < 2) {
			try {
				numeroJogadores = Integer
						.parseInt(JOptionPane
								.showInputDialog("Entre com o numero de jogadores (x > 1 e x < 17):"));
			} catch (NumberFormatException ex) {
				numeroJogadores = Integer
						.parseInt(JOptionPane
								.showInputDialog("Entrada inválida! Entre com o numero de jogadores (x > 1 e x < 17):"));
			}
		}

		Jogo jogo = new Jogo(numeroJogadores);

		while (!jogo.existeVencedor()) {
			JOptionPane.showMessageDialog(null, jogo.novaRodada());
		}

		JOptionPane.showMessageDialog(null,
				"Vencedor: Jogador " + jogo.getVencedor().getNumeroJogador());
	}
}
