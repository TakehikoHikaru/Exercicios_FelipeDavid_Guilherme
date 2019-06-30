package Lista2;

import Util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		int num = 0;

		num = Teclado.lerInt("Digite um numero inteiro negativo ou positivo");
		
		if(num<0) {
			num *= (-1);
		}
		
		System.out.println("O modulo do numero é: "+num);
		
		
	}

}
