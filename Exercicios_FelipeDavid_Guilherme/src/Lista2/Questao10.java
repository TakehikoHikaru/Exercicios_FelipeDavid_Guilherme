package Lista2;

import Util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		
		num1 = Teclado.lerInt("digite um numero inteiro: ");
		num2 = Teclado.lerInt("digite um segundo numero inteiro: ");
		
		if(num1%num2 ==0) {
			System.out.println(num2 +" é divisor de "+num1);
		}else {
			System.out.println(num2 +" não é divisor de "+num1);
		}
	}

}
