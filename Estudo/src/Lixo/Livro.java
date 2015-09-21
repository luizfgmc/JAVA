package Lixo;

public class Livro {
	private String titulo;
	private String[] autores;
	private int paginas;
	private int edicao;
	private String editora;
	private int ano;
	private int qtdAutores;

	public Livro (String valTitulo, int valPaginas, int valEdicao, 
			String valEditora, int valAno){
		titulo = valTitulo;
		paginas = valPaginas;
		edicao = valEdicao;
		editora = valEditora;
		ano = valAno;
		
		autores = new String[10];
	}
public void adicionarAutor(String nome){
	if (qtdAutores < 10){
		autores[qtdAutores] = nome;
		qtdAutores++;
	}
}
}
