package Lista2;

import Util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, diferenca;
		
		num1 = Teclado.lerInt("digite um numero inteiro: ");
		num2 = Teclado.lerInt("digite outro numero inteiro: ");
		
		if(num1<num2) {
			diferenca = num2-num1;
			System.out.println("diferença entre "+ num2 + " e " +num1 + " = " +diferenca);
		}else{
			diferenca = num1-num2;
			System.out.println("diferença entre "+ num1 + " e " +num2 + " = " +diferenca);
		}
	}

}
