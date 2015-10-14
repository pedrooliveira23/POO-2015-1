
public class Filme {
	
	/*2 - Criar uma classe Filme da seguinte forma:
    a) Um Filme tem codigo, nome, g�nero, ano e autor principal, sendo todos privados
    b) Cada atributo deve ter seus m�todos de acesso p�blicos
    c) A classe deve ter um m�todo que mostra os dados do Filme
    d) O construtor deve inicializar apenas o c�digo e o nome do filme.
    e) Os demais atributos devem ser atualizados usando os m�todos sets necess�rios*/
	
	private String nome, genero, atorPrincipal; 
	private int codigo, ano;
	static int contFilmes = 0;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAtorPrincipal() {
		return atorPrincipal;
	}
	public void setAtorPrincipal(String atorPrincipal) {
		this.atorPrincipal = atorPrincipal;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

}
