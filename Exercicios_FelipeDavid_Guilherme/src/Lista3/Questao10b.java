package Lista3;

public class Questao10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base =3;
		int resultado;
		for (int i = 0; i <16; i++) {
			if(i==0) {
				System.out.println("3 elevado a "+i+ " = 1");	
			}else if(i==1){
				System.out.println("3 elevado a "+i+ " = 3");	
			}
			else {
			base*=3; 
			System.out.println("3 elevado a "+i+ " = "+ base);
			}
		}
	}

}
