package br.com.solegas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private Integer id;
	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>();

	public Categoria(String nome) {
		this.nome = nome;
	}

	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Categoria() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) throws Exception {
		if(produtos != null) {
			this.produtos.add(produtos);
		}else {
			throw new Exception("Produto is null");
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + ", produtos=" + produtos + "]";
	}

}
