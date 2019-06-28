package Lista2;

import Util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		int num = 0;
		
		while(!(num>=100 && num<=999)) {
		num = Teclado.lerInt("Digite um numero inteiro de 3 casas");
		}
		
		num /= 100;
		System.out.println("A centena do numero digitado é "+num+"00");
		
		
		
		
	}

}
