package aula_20150515;

public class testeValores01 {
	public static void main (String[] args){
		Valores meusValores;
		meusValores = new Valores();
		meusValores.a = 1;
		meusValores.b = 2;
		meusValores.c = 3;

		System.out.println("O maior valor é: " 		+ meusValores.obterMaiorValor());

		System.out.println("O maior inteiro é: " 	+ Valores.maiorInteiro(1,2,3));

		System.out.println ("A media é " 			+ Valores.meidaInteiros(1, 2, 3));

		System.out.println ("Obter media retorna: " + meusValores.obterMeida());
	}
}
