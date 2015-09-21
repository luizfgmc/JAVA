package aula_20150313;

public class Carro {

	public String placa;
	public String modelo;
	public int ano;
	public long quilometragem;

	public Carro(String valPlaca,String valModelo, int valAno){
		placa = valPlaca;
		modelo = valModelo;
		ano = valAno;
	}
	public void adicinarQuilometragem(long km){
		quilometragem = quilometragem + km;
	}
	public String getPlaca(){
		return placa;
	}
	public String getModelo(){

		return modelo;
	}
	public int getAno(){

		return ano;
	}
	public long getQuilometragem(){
		return quilometragem;
	}

}
