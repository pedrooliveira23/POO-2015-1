package Exercicios;

public class Loja extends LojaAbs{
	private String endereco;
	private Gerente gerente;
	
	public Loja(String cnpj, String razaoSocial, String endereco, Gerente gerente) {
		super(cnpj, razaoSocial);
		this.endereco = endereco;
		this.gerente = gerente;
	}

	@Override
	public String toString() {
		return "Loja [endereco=" + endereco + ", gerente=" + gerente
				+ ", getRazaoSocial()=" + getRazaoSocial() + ", getCnpj()="
				+ getCnpj() + ", isAberta()=" + isAberta()
				+ ", getIdentificador()=" + getIdentificador() + "]";
	}
	
}
