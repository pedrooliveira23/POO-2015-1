package ex1;

public class CD extends Midia {
	protected String artista;
	protected int quantidadeFaixas;

	CD(String titulo, int ano, int duracao, String comentarios, String artista,
			int quantidadeFaixas) {
		super(titulo, ano, duracao, comentarios);
		this.artista = artista;
		this.quantidadeFaixas = quantidadeFaixas;
	}

	public String getDados() {
		return titulo + " - " + artista + " - " + ano + " - " + duracao
				+ "min - " + quantidadeFaixas + " - " + comentarios;
	}

}
