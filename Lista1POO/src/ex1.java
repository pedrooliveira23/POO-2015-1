import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {		
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor do produto:"));
		int aumento = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com uma das opções para escolher o aumento:\n1 – 10%; 2 – 25%; 3 – 30%; 4 – 50%: "));
		
		switch(aumento){
			case 1: valor = valor*1.10;
			break;
			case 2: valor = valor*1.25;
			break;
			case 3:	valor = valor*1.30;
			break;
			case 4: valor = valor*1.5;
			break;
			default: aumento = Integer.parseInt("Entrada incorreta!");
		}
		
		if(valor >= 1000 && valor <= 5000){
			valor = valor*1.01;
		}else if(valor >= 5000.01 && valor <= 10000){
			valor = valor*1.02;
		}else if(valor >= 10000.01){
			valor = valor*1.03;
		}
		
		JOptionPane.showMessageDialog(null, "Valor do produto + aumento + impostos: " + valor);
		
	}

}
