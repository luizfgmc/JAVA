package aula_20150515;

public class Valores {

	public final static int s = 0;
	private static int qtdInstancias = 0;
	public int a;
	public int b;
	public int c;

	public Valores(){
		Valores.qtdInstancias++;
	}

	public int obterMaiorValor(){
		return Valores.maiorInteiro(this.a, this.b, this.c);
	}

	public static int maiorInteiro(int v1, int v2, int v3){
		int maior = v1;
		if(v2 > maior){
			maior = v2;
		}
		if(v3 > maior){
			maior = v3;
		}
		return maior;
	}
	public static double meidaInteiros(int v1, int v2, int v3){
		double media = (v1 + v2 + v3)/3;

		return media;
	}
	public double obterMeida(){
		double media = (this.a + this.b + this.c) /3;
		return media;
	}
	public static int obterQuantidadeInstancias(){
		int qtdInstancias = Valores.qtdInstancias;
		return qtdInstancias;
	}
}