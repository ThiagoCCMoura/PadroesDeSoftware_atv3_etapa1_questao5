package atv3_etapa1_questao5;

public class Teste {
	
	public static void main(String[] args) {
		
		
		
		Livro lvr = LivroStepBuilder.newBuilder()
				.paraLivro("Java, como programar")
				.comAno(2003)
				.comAutores("H. M. Deitel","P. J. Deitel")
				.comEdicao(4)
				.comCidade("Porto alegre")
				.comEditora("Bookman")
				.comNomeOriginal("Java How to Program")
				.comTradutores("Carlos Arthur lang Lisboa")
				.comPaginas(1386)
				.comIsbn(9788536301235L)
				.constroi();
		
		lvr.mostrarDadosLivro();
		
	}
}
