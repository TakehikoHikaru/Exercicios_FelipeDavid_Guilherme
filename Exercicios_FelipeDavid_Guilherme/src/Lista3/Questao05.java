package Lista3;

import Util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		int num = 0;
		
		num = Teclado.lerInt("Digite um numero inteiro para saber a sua tabuada: ");
		
		for(int i = 1; i<=10;i++) {
			System.out.println(num+" . "+i+" = "+(num*i));
		}
		
	}

}
