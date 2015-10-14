package Exercicios;

public abstract class LojaAbs implements Registro{
	private int identificador;
	private String cnpj, razaoSocial;
	private boolean aberta;
	
	public LojaAbs(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		aberta = false;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public boolean isAberta() {
		return aberta;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	@Override
	public void registra_abertura_dia() {
		if(!aberta) {
			aberta = true;
		}
	}

	@Override
	public void registra_fechamento_dia() {
		if(aberta) {
			aberta = false;
		}
		
	}
}
