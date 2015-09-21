// Luiz Flávio Gomes Martins da Costa - RA 31518781
package Dojo1;
import java.util.Scanner;
public class CifraCesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mensagem = "";
		String cifra = "";
		String decifra = "";
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		int posicao = 0;
		int posicao_cifra;
		int posicao_decifra;
		
		//entrada
		System.out.println("Digite uma mensagem:");
		Scanner teclado = new Scanner(System.in);
		
		mensagem = teclado.nextLine();
		
		for(int i=0 ; i < mensagem.length() ; i++)
		{
			for(int j=0 ; j < alfabeto.length() ;  j++)
			{
				if (mensagem.charAt(i) ==  alfabeto.charAt(j))
				{
					posicao = j;
				}
			}
			
			posicao_cifra = (posicao + 3) % alfabeto.length();
			cifra += alfabeto.charAt( posicao_cifra);
				
		}
		
		//saida
		System.out.println(cifra);
		
		posicao = 0;
		mensagem = cifra;
		
		for(int i=0 ; i < mensagem.length() ; i++)
		{
			for(int j=0 ; j < alfabeto.length() ;  j++)
			{
				if (mensagem.charAt(i) ==  alfabeto.charAt(j))
				{
					posicao = j;
				}
			}
		posicao_decifra = ((posicao - 3) + alfabeto.length() )% alfabeto.length() ;
		decifra += alfabeto.charAt(posicao_decifra);
		}
		
		System.out.println(decifra);
		
		teclado.close();
		
	}

}
