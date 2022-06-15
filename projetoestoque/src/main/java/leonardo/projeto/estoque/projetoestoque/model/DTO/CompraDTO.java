package leonardo.projeto.estoque.projetoestoque.model.DTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompraDTO {

	private Integer idCompra;
	private Date dataCompra = new Date();
	private List<ProdutoDTO> produto = new ArrayList<>();
	private Integer fornecedor;
	
	public CompraDTO() {
		super();
	}
	
	public CompraDTO(Integer idCompra, Date dataCompra, List<ProdutoDTO> produto, Integer fornecedor) {
		super();
		this.idCompra = idCompra;
		this.dataCompra = dataCompra;
		this.produto = produto;
		this.fornecedor = fornecedor;
	}

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public List<ProdutoDTO> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoDTO> produto) {
		this.produto = produto;
	}

	public Integer getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Integer fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	
}
