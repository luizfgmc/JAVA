package aula_20150306;

import java.util.Scanner;

public class Ex01_Retangulo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Retangulo meuRetangulo;
		meuRetangulo = new Retangulo();

		System.out.println("Digite a base! ");
		meuRetangulo.base = sc.nextInt();

		System.out.println("Digite a altura!");
		meuRetangulo.altura = sc.nextInt();

		//int area;
		//area = (meuRetangulo.base * meuRetangulo.altura);
		
		System.out.println("a area do Retangulo � " + meuRetangulo.CalcArea());

		if (sc != null)
		{
			sc.close();
		}
	}
}
