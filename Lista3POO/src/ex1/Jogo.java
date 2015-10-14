package ex1;

public class Jogo extends Midia {
	protected int numeroJogadores;
	protected String plataforma;

	Jogo(String titulo, int ano, int duracao, String comentarios,
			int numeroJogadores, String plataforma) {
		super(titulo, ano, duracao, comentarios);
		this.numeroJogadores = numeroJogadores;
		this.plataforma = plataforma;
	}

	public String getDados() {
		return titulo + " - " + plataforma + " - " + ano + " - "
				+ duracao + "min - " + numeroJogadores + " - " + comentarios;
	}

}
