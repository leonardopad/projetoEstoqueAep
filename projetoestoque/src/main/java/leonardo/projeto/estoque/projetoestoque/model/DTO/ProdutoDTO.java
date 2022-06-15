package leonardo.projeto.estoque.projetoestoque.model.DTO;

import java.util.Date;


public class ProdutoDTO {

private Integer idProduto;
	
	private String nome;
	private Integer quantidade;
	private Integer tipo;
	private Integer situacao;
	private Date validade;
	private Integer compra;
	
	public ProdutoDTO() {
		super();
	}

	public ProdutoDTO(Integer idProduto, String nome, Integer quantidade, Integer tipo, Integer situacao, Date validade,
			Integer compra) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.situacao = situacao;
		this.validade = validade;
		this.compra = compra;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getSituacao() {
		return situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Integer getCompra() {
		return compra;
	}

	public void setCompra(Integer compra) {
		this.compra = compra;
	}

}
