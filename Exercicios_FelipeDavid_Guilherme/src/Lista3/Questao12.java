package Lista3;

import Util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		double num = 0.0;
		double menor = 0.0;
		double maior = 0.0;
		double media = 0.0;
		int count = 0;

		do {
			num = Teclado.lerDouble("digite números reais: ");
			if (num != -1) {
				media += num;
				count++;
				if (count == 1) {
					menor = num;
					maior = num;
				} else if (num < menor) {
					menor = num;
				} else if (num > maior) {
					maior = num;
				}

			}
		} while (num != -1);
		media /= count;

		System.out.println("menor numero digitado: " + menor);
		System.out.println("maior numero digitado: " + maior);
		System.out.println("media dos " + count + " numeros digitados: " + media);
	}

}
