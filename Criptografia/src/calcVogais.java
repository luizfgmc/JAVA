import java.util.Scanner;

public class calcVogais {

	public static void main (String[] arg){

		String texto = "";
		int n =0;
		String alfabetoClaro = "abcdef";
		String alfabetoCifrado = "defghi";
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um texto");

		texto = sc.nextLine();

		for (int i = 0; i < texto.length(); i++) {

			if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' ||	texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u'){
				n++;		
			}

		}

		System.out.println("o numero de vogiais é " + n);

		
	}

	
}
