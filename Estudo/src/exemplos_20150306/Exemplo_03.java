package exemplos_20150306;

public class Exemplo_03 {
	public static void main (String[] args){
		Exemplo_03_Retangulo  meuRetangulo;
		meuRetangulo = new Exemplo_03_Retangulo();
		meuRetangulo.base = 5;
		meuRetangulo.altura = 7;
		
		System.out.println ("o perimetro é " + meuRetangulo.obterPerimetro());
		
		
		
	}

}
