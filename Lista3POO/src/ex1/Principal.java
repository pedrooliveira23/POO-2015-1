package ex1;

public class Principal {

	public static void main(String[] args) {
		Midia[] loja = new Midia[30];

		for (int i = 0; i < 10; i++) {

			loja[i] = new CD(new MontaPalavras().getPalavra(4),
					(int) (Math.random() * 25 + 1990), (int) (Math.random() * 100),
					new MontaPalavras().getPalavra(4),
					new MontaPalavras().getPalavra(4),
					(int) (Math.random() * 100));
		}

		for (int i = 9; i < 20; i++) {

			loja[i] = new Filme(new MontaPalavras().getPalavra(4),
					(int) (Math.random() * 25 + 1990), (int) (Math.random() * 100),
					new MontaPalavras().getPalavra(4),
					new MontaPalavras().getPalavra(4));
		}

		for (int i = 19; i < 30; i++) {

			String[] plataforma = { "PS4", "XONE", "PC", "WII U" };

			loja[i] = new Jogo(new MontaPalavras().getPalavra(4),
					(int) (Math.random() * 25 + 1990), (int) (Math.random() * 100),
					new MontaPalavras().getPalavra(4),
					(int) (Math.random() * 10),
					plataforma[(int) (Math.random() * 4)]);
		}

		for (int i = 0; i < loja.length; i++) {
			if (loja[i] instanceof CD) {
				System.out.println("CD:");
			} else if (loja[i] instanceof Filme) {
				System.out.println("Filme:");
			} else {
				System.out.println("Jogo:");
			}
			System.out.println(loja[i].getDados() + "\n");
		}

	}
}
