package Lista3;

public class Questao15 {

	public static void main(String[] args) {
		int maior = 1;
		int menor = 0;
		int aux = 0;
		
		
		for(int i =0;i<=15;i++) {
			aux = maior + menor;
			maior = menor;
			menor = aux;
			System.out.println(maior);
		}
	}

}
