package atv3_etapa1_questao5;

import java.util.List;

public class Livro {
	private String nomeNacional;
	private int ano;
	private List<String> autores;
	private int edicao;
	private String cidade;
	private String editora;
	private String nomeOriginal;
	private List<String> tradutores;
	private int paginas;
	private long isbn;

	public Livro() {
		
	}
	
	public void mostrarDadosLivro() {
		System.out.println("\n Nome do Livro: " + getNomeNacional());
		System.out.println("\n Ano: " + getAno());
		System.out.println("\n Autores: " + getAutores());
		System.out.println("\n Edição: " + getEdicao());
		System.out.println("\n Cidade: " + getCidade());
		System.out.println("\n Editora: " + getEditora());
		System.out.println("\n Nome Original: " + getNomeOriginal());
		System.out.println("\n Tradutor: " + getTradutores());
		System.out.println("\n Quant. Páginas: " + getPaginas());
		System.out.println("\n ISBN: " + getIsbn());

	}

	// getters e setters omitidos
	
	public String getNomeNacional() {
		return nomeNacional;
	}

	public int getAno() {
		return ano;
	}

	public List<String> getAutores() {
		return autores;
	}

	public int getEdicao() {
		return edicao;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEditora() {
		return editora;
	}

	public String getNomeOriginal() {
		return nomeOriginal;
	}

	public List<String> getTradutores() {
		return tradutores;
	}

	public int getPaginas() {
		return paginas;
	}

	public long getIsbn() {
		return isbn;
	}

	
	
	public void setNomeNacional(String nomeNacional) {
		this.nomeNacional = nomeNacional;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public void setNomeOriginal(String nomeOriginal) {
		this.nomeOriginal = nomeOriginal;
	}

	public void setTradutores(List<String> tradutores) {
		this.tradutores = tradutores;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	
	

}
