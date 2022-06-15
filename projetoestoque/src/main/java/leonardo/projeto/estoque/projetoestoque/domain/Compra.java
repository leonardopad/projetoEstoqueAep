package leonardo.projeto.estoque.projetoestoque.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCompra;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataCompra = new Date();
	
	@OneToMany(mappedBy = "compra")
	private List<Produto> produto = new ArrayList<>();
	
	@ManyToOne
    @JoinColumn(name = "idFornecedor")
	private Fornecedor fornecedor;
	
	public Compra() {
		super();
	}
	
	public Compra(Integer idCompra, Date dataCompra, Fornecedor fornecedor) {
		super();
		this.idCompra = idCompra;
		this.dataCompra = dataCompra;
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




	public Fornecedor getFornecedor() {
		return fornecedor;
	}




	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCompra);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		return Objects.equals(idCompra, other.idCompra);
	}
	
	
	
	
	
}
