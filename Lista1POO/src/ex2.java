import javax.swing.JOptionPane;
public class ex2 {

	public static void main(String[] args) {

		double horas = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade de horas trabalhadas:"));
		double salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Entre com o salário hora:"));
		int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de dependentes:"));
		
		double salarioBruto = horas * salarioHora + (50 * dependentes);
		double descontoINSS = 0;
		if(salarioBruto > 1000){
			descontoINSS = salarioBruto * 0.09;
		}
		
		double descontoIR = 0;
		
		if(salarioBruto > 500 && salarioBruto <= 1000){
			descontoIR = salarioBruto * 0.05;
		}else if(salarioBruto > 1000){
			descontoIR = salarioBruto * 0.07;
		}
		
		double salarioLiquido = salarioBruto - descontoINSS - descontoIR;
		
		JOptionPane.showMessageDialog(null, "Informações sobre Salário:\nSalário Bruto: "+salarioBruto+"\nDesconto do INSS: "+descontoINSS+"\nDesconto IR: "+descontoIR+"\nSalário Líquido: "+salarioLiquido);
		
	}

}
