package Lista1;

import Util.Teclado;

public class Questao09 {
	public static void main(String[] args) {		
		int numero;
		numero = Teclado.lerInt("digite um numero: ");
		
		for (int i = 1; i <=numero; i++) {
			if (i%3 == 0 && i% 5 == 0) {
				System.out.println(i + " é multiplo de 3 e 5");
			}
			
		}
		
	}
}