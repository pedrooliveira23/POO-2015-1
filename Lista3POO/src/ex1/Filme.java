package ex1;

public class Filme extends Midia {
	protected String diretor;

	Filme(String titulo, int ano, int duracao, String comentarios,
			String diretor) {
		super(titulo, ano, duracao, comentarios);
		this.diretor = diretor;
	}
	
	public String getDados() {
		return titulo + " - " + diretor + " - " + ano + " - " + duracao
				+ "min - " + comentarios;
	}

}
