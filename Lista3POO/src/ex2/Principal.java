package ex2;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		MontaPalavras montaPalavras = new MontaPalavras();
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>(10);
		
		for(int i = 0; i < 10; i++) {
			if(i < 2) {
				Horista novoHorista = new Horista();
				novoHorista.setNome(montaPalavras.getPalavra((int)(Math.random()*3 + 3)));
				novoHorista.setSobrenome(montaPalavras.getPalavra((int)(Math.random()*3 + 3)));
				novoHorista.setQuantidadeHoras(Math.random()*80 + 80);
				novoHorista.setValorHora(18.75);
				funcionarios.add(novoHorista);
			}
			
			if(i >= 2 && i < 6) {
				Administrador novoAdm = new Administrador();
				novoAdm.setNome(montaPalavras.getPalavra((int)(Math.random()*3 + 3)));
				novoAdm.setSobrenome(montaPalavras.getPalavra((int)(Math.random()*3 + 3)));
				novoAdm.setSalario(Math.random()*2000 + 8000);
				funcionarios.add(novoAdm);
			}
			
			if(i >= 6 && i < 9) {
				Comissionado novoComissionado = new Comissionado();
				novoComissionado.setNome(montaPalavras.getPalavra((int)(Math.random()*3 + 3)));
				novoComissionado.setSobrenome(montaPalavras.getPalavra((int)(Math.random()*3 + 3)));
				novoComissionado.setComissao(6);
				novoComissionado.setTotalVendas(Math.random() * 166666);
				novoComissionado.setSalario(1200);
				funcionarios.add(novoComissionado);
			}
			
			if(i > 9) {
				Gerente novoGerente = new Gerente();
				novoGerente.setNome(montaPalavras.getPalavra((int)(Math.random()*3 + 3)));
				novoGerente.setSobrenome(montaPalavras.getPalavra((int)(Math.random()*3 + 3)));
				novoGerente.setBonificacao(800);
				novoGerente.setSalario(12000);
				funcionarios.add(novoGerente);
			}
		}
		
		for(Funcionario func : funcionarios) {
			if(func instanceof Administrador) {
				System.out.println(((Administrador) func).getDados());
			}else if(func instanceof Gerente){
				System.out.println(((Gerente) func).getDados());
			}else if(func instanceof Comissionado){
				System.out.println(((Comissionado) func).getDados());
			}else{
				System.out.println(((Horista) func).getDados());
			}
		}
		
	}

}
