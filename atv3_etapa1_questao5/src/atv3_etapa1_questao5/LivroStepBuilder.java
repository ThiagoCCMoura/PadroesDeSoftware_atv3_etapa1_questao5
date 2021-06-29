package atv3_etapa1_questao5;

import java.util.ArrayList;
import java.util.List;

public class LivroStepBuilder extends Livro{
	
	// vamos obrigar o uso do método newBuilder()
	public LivroStepBuilder() {
		
	}
	
	// factory method
	public static NomeNacionalStep newBuilder() {
		return new Steps();
	}
	
	// passos para criação do pipeline de objetos
	public static interface NomeNacionalStep {
		AnoStep paraLivro(String nomeNacional);
	}
	
	public static interface AnoStep{
		AutoresStep comAno(int ano);
	}
	
	public static interface AutoresStep{
		EdicaoStep comAutores(String autor1, String autor2);
	}
	
	public static interface EdicaoStep{
		CidadeStep comEdicao (int edicao);
	}
	
	public static interface CidadeStep{
		EditoraStep comCidade(String cidade);
	}

	public static interface EditoraStep{
		NomeOriginalStep comEditora(String editora);
	}

	public static interface NomeOriginalStep{
		TradutoresStep comNomeOriginal(String nomeOriginal);
	}

	public static interface TradutoresStep{
		PaginasStep comTradutores(String tradutor);
	}

	public static interface PaginasStep{
		IsbnStep comPaginas(int paginas);
	}
	
	public static interface IsbnStep{
		ConstroiStep comIsbn (long isbn);
	}

	public static interface ConstroiStep{
		Livro constroi();
	}
	
	
	
	// classe interna Steps que implementa o pipeline com todos os passos
	private static class Steps
				implements NomeNacionalStep, AnoStep, AutoresStep, EdicaoStep, 
				CidadeStep, EditoraStep, NomeOriginalStep, TradutoresStep, 
				PaginasStep, IsbnStep, ConstroiStep{
		
		
		private Livro livro;
				
		

		@Override
		public AnoStep paraLivro(String nomeNacional) {
			this.livro = new Livro();
			this.livro.setNomeNacional(nomeNacional);
			return this;
		}

		@Override
		public AutoresStep comAno(int ano) {
			this.livro.setAno(ano);
			return this;
		}

		@Override
		public EdicaoStep comAutores(String autor1, String autor2) {
			List<String> autores = new ArrayList<>();
			autores.add(autor1);
			autores.add(autor2);
			this.livro.setAutores(autores);
			return this;
		}

		@Override
		public CidadeStep comEdicao(int edicao) {
			this.livro.setEdicao(edicao);
			return this;
		}

		@Override
		public EditoraStep comCidade(String cidade) {
			this.livro.setCidade(cidade);
			return this;
		}

		@Override
		public NomeOriginalStep comEditora(String editora) {
			this.livro.setEditora(editora);
			return this;
		}

		@Override
		public TradutoresStep comNomeOriginal(String nomeOriginal) {
			this.livro.setNomeOriginal(nomeOriginal);
			return this;
		}

		@Override
		public PaginasStep comTradutores(String tradutor) {
			List<String> tradutores = new ArrayList<String>();
			tradutores.add(tradutor);
			this.livro.setTradutores(tradutores);
			return this;
		}
		
		@Override
		public IsbnStep comPaginas(int paginas) {
			this.livro.setPaginas(paginas);
			return this;
		}

		@Override
		public ConstroiStep comIsbn(long isbn) {
			this.livro.setIsbn(isbn);
			return this;
		}

		@Override
		public Livro constroi() {
			
			return this.livro;
		}
		
		
		
	}
				
	
	
	
	
	
	
	
	
	
	
		
		
		
	/*
	public LivroStepBuilder nomeNacional(String nomeNacional) {
		this.nomeNacional = nomeNacional;
		return this;
	}
	
	public LivroStepBuilder ano(int ano) {
		this.ano = ano;
		return this;
	}
	
	public LivroStepBuilder autores(List<String> autores) {
		this.autores = autores;
		return this;
	}

	public LivroStepBuilder edicao(int edicao) {
		this.edicao = edicao;
		return this;
	}

	public LivroStepBuilder cidade(String cidade) {
		this.cidade = cidade;
		return this;
	}

	public LivroStepBuilder editora (String editora) {
		this.editora = editora;
		return this;
	}

	public LivroStepBuilder nomeOriginal(String nomeOriginal) {
		this.nomeNacional = nomeOriginal;
		return this;
	}

	public LivroStepBuilder tradutores(List<String> tradutores) {
		this.tradutores = tradutores;
		return this;
	}

	public LivroStepBuilder paginas(int paginas) {
		this.paginas = paginas;
		return this;
	}

	public LivroStepBuilder isbn(long isbn) {
		this.isbn = isbn;
		return this;
	}
	
	public Livro criarLivro() {
		return new Livro(nomeNacional, ano, autores, edicao, cidade, editora, nomeOriginal, tradutores, paginas, isbn);
	}*/
	
}
