package Lista2;

import Util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int menor =0;
		int maior =0;
		
		num = Teclado.lerInt("digite um numero inteiro(1):");
		maior=num;
		menor=num;
		
		for (int i = 1; i <5; i++) {
			 num = Teclado.lerInt("digite um numero inteiro("+(i+1)+"):");
			 if(num<menor) {
				 menor = num;
			 }else if (num>maior){
				 maior = num;
				 
			 }			 
		}
		System.out.println("maior numero digitado: " +maior);
		System.out.println("menor numero digitado: " +menor);
	}

}
