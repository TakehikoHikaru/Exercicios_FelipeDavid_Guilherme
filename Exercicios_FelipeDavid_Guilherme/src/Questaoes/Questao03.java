package exerciciosemdupla;
import Util.Teclado;
public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabuada = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		int escolherTabuada = Teclado.lerInt("digite a tabuada que voce quer: ");
		
		for (int i = 0; i < tabuada.length; i++) {
			tabuada[i]*=escolherTabuada;
			System.out.println(tabuada[i]);
		}
	}

}
