package br.com.solegas.modelo;

public class Produto {

	private Integer id;
	private String nome;
	private String descricao;
	private Double preco;
	private Integer idCategoria;
	
	public Produto(String nome, String descricao, Double preco, int idCategoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.idCategoria = idCategoria;
	}

	public Produto(int id, String nome, String descricao, double preco) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Integer getId_categoria() {
		return idCategoria;
	}

	public void setId_categoria(Integer id_categoria) {
		this.idCategoria = id_categoria;
	}

	public Integer getId() {
		return id;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "";
	}

}
