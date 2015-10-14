package ex1;

public class MontaPalavras {
	public static String getPalavra(int n) {
		char[] letras = new char[26];

		for (int i = 0; i < letras.length; i++) {
			letras[i] = (char) (97 + i);
		}
		
		String palavra = "";
		
		for(int i = 0; i < n; i++) {
			palavra += letras[(int)(Math.random() * n)];
		}
		
		char primeira = Character.toUpperCase(palavra.charAt(0));
		palavra = primeira + palavra.substring(1, palavra.length());
		return palavra;
	}
}
