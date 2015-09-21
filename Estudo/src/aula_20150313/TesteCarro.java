package aula_20150313;

public class TesteCarro {

	public static void main (String[] agrs){
		Carro meuCarro;
		meuCarro = new Carro("aaa-1234", "uno", 2012);
		meuCarro.adicinarQuilometragem(500);
		System.out.println ("A placa é " + meuCarro.getPlaca());
		System.out.println ("O modelo é " + meuCarro.getModelo());
		System.out.println("A ano é " + meuCarro.getAno());
		System.out.println("A quilometragem é " + meuCarro.getQuilometragem());
		
	}


}
