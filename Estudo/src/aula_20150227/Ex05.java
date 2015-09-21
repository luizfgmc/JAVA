// Leia 2 n�meros e pergunte qual opera��o o usu�rio quer fazer: 1 � somar, 2 - subtrair, 3 - dividir ou 
// 4 - multiplicar os n�meros. O resultado da opera��o escolhida deve ser impresso.
package aula_20150227;

import java.util.Scanner;

public class Ex05{

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int result = 0;

		// recebe o primeiro numero
		System.out.println("Digite um numero:");
		int num1 = sc.nextInt();

		// recebe o segundo numero
		System.out.println("Digite um numero:");
		int num2 = sc.nextInt();

		// Apresenta opção de escolha e recebe o valor escolhido
		System.out.println("Digite: 1 - (+) | 2 - (-) | 3 - (/) - 4 - (*)");
		int op = sc.nextInt();

		// verifica a escolha

		if (op == 1)
		{
			result = (num1 + num2);
		}

		if (op == 2)
		{
			result = (num1 - num2);
		}

		if (op == 3)
		{
			result = (num1 / num2);
		}

		if (op == 4)
		{
			result = (num1 + num2);
		}

		// imprime o valor da operação
		System.out.println("Digite: 1 - (+) | 2 - (-) | 3 - (/) - 4 - (*)");
		System.out.println(result);

		if (sc != null)
		{ 
			sc.close();
		}
	}
}

