package Lista2;

import Util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		double num = 0;
		
		num = Teclado.lerInt("Digite um numero: ");
		
		if(num>20) {
			num /= 2; 
			System.out.println("A metade do numero que voc� digitou �:" + num);
		}else{
			System.out.println("O numero que voc� digitou �:"+num);
		}
		
		
	}

}
