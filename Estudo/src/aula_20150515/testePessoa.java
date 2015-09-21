package aula_20150515;

public class testePessoa {

	public static void main (String[] args){

		Pessoa p1;
		p1 = new Pessoa("Luiz", 10, 'm');

		System.out.println(" ------ P1------");
		System.out.println("O nome é: " 	+ p1.getNome());
		System.out.println("A idade é: " 	+ p1.getIdade());
		System.out.println("O sexo é: " 	+ p1.getSexo());

		Pessoa p2;
		p2 = new Pessoa();
		p2.setNome("Luiz Flávio");
		p2.setAltura(1.82);
		p2.setidade(30);
		p2.setPeso(88);
		p2.setSexo('m');

		System.out.println(" ------ P2 ------");
		System.out.println("O nome é: " 	+ p2.getNome());
		System.out.println("O peso é: " 	+ p2.getPeso());
		System.out.println("A altura é: " 	+ p2.getAltura());
		System.out.println("A idade é: " 	+ p2.getIdade());
		System.out.println("O sexo é: " 	+ p2.getSexo());

	}
}
