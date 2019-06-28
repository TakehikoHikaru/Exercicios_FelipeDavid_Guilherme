package Lista2;

import Util.Teclado;

public class Questao08 {

	public static void main(String[] args) {	
		int num;
	
		num = Teclado.lerInt("digite um numero inteiro qualquer: ");
		
		if(num<=10 && num>0) {
			System.out.println("o numero está na faixa de 1 a 10");
		}else {
			System.out.println("o numero não na faixa de 1 a 10");
		}
		
	}

}
