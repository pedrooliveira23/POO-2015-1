import javax.swing.JOptionPane;
public class ex5 {

	public static void main(String[] args) {
		
		double terreno = Double.parseDouble(
				JOptionPane.showInputDialog("Entre com a área total do terreno: ")
				);
		double construido = Double.parseDouble(
				JOptionPane.showInputDialog("Entre com a área construida: ")
				);
		
		JOptionPane.showMessageDialog(null, "Valor do imposto = " + (
				3.8 * (terreno - construido) + 5 * (construido)
				));
		
	}

}
