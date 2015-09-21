// Luiz Flávio Gomes Martins da Costa - RA 31518781
package Dojo2;

public class TesteVigenere {

	public static void main(String[] args) {
		Vigenere vigenere = new Vigenere();

		System.out.println(vigenere.cifra("Luiz"));
		System.out.println(vigenere.decifra(vigenere.cifra("Luiz")));

	}
}
