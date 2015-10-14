package ex1;

public class Midia {
	protected String titulo, comentarios;
	protected int ano, duracao;

	Midia(String titulo, int ano, int duracao, String comentarios) {
		this.titulo = titulo;
		this.ano = ano;
		this.duracao = duracao;
		this.comentarios = comentarios;
	}
	
	public String getDados() {
		return titulo + " - " + ano + " - " + duracao + "min - " + comentarios;
	}

}
