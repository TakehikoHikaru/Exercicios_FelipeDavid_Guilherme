package Questoes;

import Util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		int num = 6;		
		num = Teclado.lerInt("Digite um numero: ");		
		int soma = 0;
		
		for(int i = 0;i<num;i++) {
			soma += i+1;
		}
		System.out.println(soma);
		
		
		
	}

}
