import javax.swing.JOptionPane;
public class PrincipalFilmes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3 � Criar uma classe Principal que receba dados de filmes, atrav�s da classe scanner ou
        JOptionPane, e crie v�rios filmes at� que seja digitado o c�digo 0, mostrando ap�s a cria��o os
        dados do filme, atrav�s do m�todo criado no item c) do exerc�cio 2.*/
		

		Filme[] locadora = new Filme[100];
		String entrada;
		
		do {
			entrada = JOptionPane.showInputDialog("Entre com o codigo do Filme");
			if (entrada.equals("0") == false) {
				Filme novoFilme = new Filme();
				novoFilme.setCodigo(Integer.parseInt(entrada));
				novoFilme.setNome(JOptionPane.showInputDialog("Entre com o Titulo do Filme"));
				novoFilme.setAtorPrincipal(JOptionPane.showInputDialog("Entre com o Ator Principal do Filme"));
				locadora[Filme.contFilmes - 1] = novoFilme;
				Filme.contFilmes++;
			}

		}

	}

}
