package exemplos_20150306;

public class Exemplo_02 {
	public static void main(String[] args){
		Exemplo_02_Retangulo meuRetangulo;
		meuRetangulo = new Exemplo_02_Retangulo();
		meuRetangulo.base = 5;
		meuRetangulo.altura = 7;

		System.out.println("A área do retangulo é " + meuRetangulo.obterArea());

	}
}
