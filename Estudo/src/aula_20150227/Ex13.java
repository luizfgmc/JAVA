// Leia uma sequ�ncia de 10 n�meros e imprima-os na ordem contr�ria.
package aula_20150227;

// Importa o Scanner.
import java.util.Scanner;

public class Ex13 {

	public static void main (String[] args)
	{
		// Cria um novo Scanner. 
		Scanner sc = new Scanner(System.in);
		// Cria o array numeros
		int[] numeros = new int[10];
		// Inicia variavel i.
		int i = 0;

		while (i< 10)
		{
			// Le os 10 nuemros
			System.out.println("Digite o numero " + (i+1) +"� de 10 ");
			numeros[i] = sc.nextInt();
			i++;
		}

		for (int y = (numeros.length-1); y >= 0 ; y--)
		{
			// Imprime os numeros digitados em ordem invertida.
			System.out.println("Numero com ordens invertidas " + numeros[y]);
		}

		// Fecha o Scanner.
		if (sc != null)
		{
			sc.close();
		}

	}
}
