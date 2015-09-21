// Leia um n�mero inteiro positivo e imprima todos os seus divisores

package aula_20150227;

import java.util.Scanner;

public class Ex09 {

	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		int total = 0;

		for (int i = 1; i <= num ; ++i)
		{
			if (num%i==0)
			{
				total++;
				System.out.println("O numero " + num + "� divisivil por " + i);
			}

		}
		System.out.println("O numero " + num + " tem um total de " + total + " divisores.");
		if (sc!= null)
		{
			sc.close();
		}
	}
}
