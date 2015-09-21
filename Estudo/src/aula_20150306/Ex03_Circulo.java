package aula_20150306;

public class Ex03_Circulo {
	public static void main (String[] args){
		Circulo meuCirculo;
		meuCirculo = new Circulo();
		meuCirculo.raio = 10;
		
		System.out.println ("A area do circulo é  " + meuCirculo.imprimeArea());
		
		System.out.println ("A area do circulo é  " + meuCirculo.imprimePerimetro());
		
	}

}
