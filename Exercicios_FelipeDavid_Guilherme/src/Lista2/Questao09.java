package Lista2;

import Util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		int num = 0;
		
		num = Teclado.lerInt("Digite um numero inteiro positivo, negativo ou nulo: ");
		
		if(num>0) {
			System.out.println("O numero � positivo");
		}else if(num<0) {
			System.out.println("O numero � negativo");
		}else {
			System.out.println("O numero � nulo");
		}
		
		
		
		

	}

}
