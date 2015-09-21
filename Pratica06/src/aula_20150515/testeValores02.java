package aula_20150515;

public class testeValores02 {
	public static void main(String[] args){
		Valores v1;
		v1 = new Valores();
		Valores v2;
		v2 = new Valores();
		Valores v3;
		v3 = new Valores();
		Valores v4;
		v4 = new Valores();

		System.out.println("Quantidade instanciada: " + Valores.obterQuantidadeInstancias());
	}
}
