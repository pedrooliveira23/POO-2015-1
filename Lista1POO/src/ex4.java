import javax.swing.JOptionPane;
public class ex4 {

	public static void main(String[] args) {
		double massa = Double.parseDouble(JOptionPane.showInputDialog("Entre com a massa em kg:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com a altura em m:"));
		JOptionPane.showMessageDialog(null, "IMC = "+(massa/Math.pow(altura, 2)));
	}

}
