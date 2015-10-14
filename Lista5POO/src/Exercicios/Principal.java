package Exercicios;

public class Principal {

	public static void main(String[] args) {
		Loja matriz = new Loja("123456789/0001-1", "Loja do Pedro", "Rua X, n1", new Gerente());
		matriz.setIdentificador(0);
		
		Loja filial1 = new Loja("987654321/0001-1", "Loja do Pedro 2", "Rua Y, n23", new Gerente());
		filial1.setIdentificador(1);
		
		Loja filial2 = new Loja("741852963/0001-1", "Loja do Pedro 3", "Rua Z, n99", new Gerente());
		filial2.setIdentificador(2);
		
		System.out.println(matriz.toString() + "\n" + filial1.toString() + "\n" + filial2.toString());
		
		matriz.registra_abertura_dia();
		filial1.registra_abertura_dia();
		filial2.registra_abertura_dia();
		
		System.out.println("\n\n" +matriz.toString() + "\n" + filial1.toString() + "\n" + filial2.toString());
	}

}
