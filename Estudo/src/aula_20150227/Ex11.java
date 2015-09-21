//Imprima todos os n�meros primos entre 1 e 999.
package aula_20150227;

public class Ex11 {

	public static void main (String[] args)
	{
		int i = 999, totdiv=0, totprimos = 0;
		while (i > 0)
		{
			
			for (int y = 1; y <= i ; y++)
			{
				if (i%y==0)
				{
					totdiv++;
				}
			}
			if (totdiv <= 2)
			{
				System.out.println("O numero " + i + " � primo!");
				totprimos++;
			}
			i--;
			totdiv= 0;
			
		}

		System.out.println("O total de numeros primos s�o " + totprimos);
	}
}
