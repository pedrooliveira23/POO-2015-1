import javax.swing.JOptionPane;
public class ex3 {

	public static void main(String[] args) {		
		String operacao = JOptionPane.showInputDialog("Entre com a operação (Ex: 2+2):");
		
		if(operacao.indexOf('+') >= 0){
			String antes = (operacao.substring(0, operacao.indexOf('+')));
			String depois = (operacao.substring(operacao.indexOf('+')+1, operacao.length()));
			double numeroA = Integer.parseInt(antes.trim());
			double numeroB = Integer.parseInt(depois.trim());
			JOptionPane.showMessageDialog(null, operacao+" = "+ (numeroA+numeroB));
		}else if(operacao.indexOf('-') >= 0){
			String antes = (operacao.substring(0, operacao.indexOf('-')));
			String depois = (operacao.substring(operacao.indexOf('-')+1, operacao.length()));
			double numeroA = Integer.parseInt(antes.trim());
			double numeroB = Integer.parseInt(depois.trim());
			JOptionPane.showMessageDialog(null, operacao+" = "+ (numeroA-numeroB));
		}else if(operacao.indexOf('/') >= 0){
			String antes = (operacao.substring(0, operacao.indexOf('/')));
			String depois = (operacao.substring(operacao.indexOf('/')+1, operacao.length()));
			double numeroA = Integer.parseInt(antes.trim());
			double numeroB = Integer.parseInt(depois.trim());
			JOptionPane.showMessageDialog(null, operacao+" = "+ (numeroA/numeroB));
		}else if(operacao.indexOf('*') >= 0){
			String antes = (operacao.substring(0, operacao.indexOf('*')));
			String depois = (operacao.substring(operacao.indexOf('*')+1, operacao.length()));
			double numeroA = Integer.parseInt(antes.trim());
			double numeroB = Integer.parseInt(depois.trim());
			JOptionPane.showMessageDialog(null, operacao+" = "+ (numeroA*numeroB));
		}else{
			JOptionPane.showMessageDialog(null, operacao+" não é válida!");
		}

	}

}
