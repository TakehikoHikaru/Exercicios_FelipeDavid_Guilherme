package Lista2;

import Util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		num = Teclado.lerInt("digite um numero inteiro: ");
		
		if (num%4 ==0 && num%5==0) {
			System.out.println("O valor '" + num + "' � divisivel por 4 e 5");
		}else {
			System.out.println("Valor n�o � divis�vel por 4 e 5");
		}
	}

}
