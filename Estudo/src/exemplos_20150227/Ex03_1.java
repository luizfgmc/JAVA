// Exercicios 01 ao 04

package exemplos_20150227;

import java.util.Scanner;

public class Ex03_1{

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);


		// recebe o nome
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();
		System.out.println(nome);

		// recebe o valor do numero 1
		System.out.println("Digite o primeiro numero:");
		int num1 = sc.nextInt();

		// recebe o valor do numero 2
		System.out.println("Digite o segundo numero:");
		int num2 = sc.nextInt();

		// Imprime a soma dos dois numeros
		System.out.println("A soma dos dois numeros é ");
		System.out.println(num1 + num2);

		// Recebe o valor da base
		System.out.println ("Digite a base");
		int base = sc.nextInt();

		// Recebe o valor da altura
		System.out.println ("Digite a altura");
		int altura = sc.nextInt();

		// Calcula e imprime a area
		System.out.println("A area e: ");
		System.out.println(base * altura);

		// Calcula e imprime o perimetro
		System.out.println("O perimetro e: ");
		System.out.println((2  * base) + (2*altura));

		if (sc != null)
		{
			sc.close();
		}

	}

}