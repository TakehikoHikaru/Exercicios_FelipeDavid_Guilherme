package Lista3;

import Util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
			int b = 0;
			int e = 0;
			int result =1;
		b = Teclado.lerInt("Digite um numero inteiro:");
		e = Teclado.lerInt("Digite um numero inteiro para ser o expoente:");

		while(e>0) {
			result*=b;
			e--;
		}
		System.out.println(result);
		
	}

}
