package aula_20150306;

public class Circulo {
	public double pi = 3.141516 ;
	public int raio;

	public double imprimeArea(){
		//Formula para calculo da area (Pi x r2)
		double area;
		area = (pi * Math.pow(raio,2)) ;
		return area;
	}

	public double imprimePerimetro(){
		//Formula para calculo da perimetro (2 x Pi x r)
		double perimetro;
		perimetro = (2 * pi * raio);
		return perimetro;
	}

}
