// Leia uma sequ�ncia de 10 n�meros e imprima: o maior, o menor, a soma e a m�dia entre eles
package aula_20150227;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int soma = 0, media = 0;

		for (int i = 0; i<10 ; i++)
		{
			System.out.println("Digite 10 numeros:");
			numeros[i] = sc.nextInt();
			soma = (soma + numeros[i]);
		}
		
		Arrays.sort(numeros);
		media = (soma/numeros.length);
		
		System.out.println("O maior numero � " + numeros[9]);
		System.out.println("O menor numero � " + numeros[1]);
		System.out.println("A soma � " + soma);
		System.out.println("A media � " + media);


		if (sc != null)
		{
			sc.close();
		}

	}
}
