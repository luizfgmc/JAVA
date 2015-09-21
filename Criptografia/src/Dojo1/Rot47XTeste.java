// Luiz Flávio Gomes Martins da Costa - RA 31518781
package Dojo1;

public class Rot47XTeste {
	public static void main(String[] args) {
		Rot47x cifra = new Rot47x();

		System.out.println("Texto em cifra: "  + cifra.getCifra("luiz", 1));

		System.out.println("Texto original: " + cifra.getDeCifra(cifra.getCifra("luiz", 0),0));

	}
}
