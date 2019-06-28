package Lista2;

import Util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = Teclado.lerInt("Digite um numero: ");
		b = Teclado.lerInt("Digite um numero: ");
		c = Teclado.lerInt("Digite um numero: ");
		System.out.println("\n\n\n\n\n");
		if(a>b && a>c) {
			System.out.println(a);
		}else if(b>a && b>c) {
			System.out.println(b);
		}else if(c>b && c>a) {
			System.out.println(c);
		}
		
		if((a>b && a<c || a>c && a<b)) {
			System.out.println(a);
		}else if((b>a && b<c) || (b>c && b<a)) {
			System.out.println(b);
		}else if((c>b && c<a) || (c>c && c<b)) {
			System.out.println(c);
		}
		
		if(a<b && a<c) {
			System.out.println(a);
		}else if(b<a && b<c) {
			System.out.println(b);
		}else if(c<b && c<a) {
			System.out.println(c);
		}
	}

}
