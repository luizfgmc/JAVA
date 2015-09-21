package exemplos_20150306;

public class Exemplo_01 {
	public static void main(String[] args){
		Exemplo_01_Retangulo meuRetangulo;
		meuRetangulo = new Exemplo_01_Retangulo();
		meuRetangulo.base = 5;
		meuRetangulo.altura = 7;

		int area;
		area = meuRetangulo.base * meuRetangulo.altura;
		System.out.println ("A área do Retângulo é " + area);

	}

}
