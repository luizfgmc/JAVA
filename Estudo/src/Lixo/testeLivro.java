package Lixo;

public class testeLivro {
	public static void main(String[] args) {
		Livro l1 = new Livro("Livro #1", 200, 1, "EdA", 2015);
		l1.adicionarAutor("Autor #1");
		l1.adicionarAutor("Autor #2");
		l1.adicionarAutor("Autor #3");
		Livro l2 = new Livro("Livro #2", 300, 2, "EdB", 2014);
		l2.adicionarAutor("Autor #1");
		l2.adicionarAutor("Autor #2");
	}
}

