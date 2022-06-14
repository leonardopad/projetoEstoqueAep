package leonardo.projeto.estoque.projetoestoque.domain;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;


import leonardo.projeto.estoque.projetoestoque.domain.enums.SituacaoProduto;
import leonardo.projeto.estoque.projetoestoque.domain.enums.TipoProduto;

@Entity
public class Produto {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduto;
	
	private String nome;
	private Integer quantidade;
	private Integer tipo;
	private Integer situacao;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date validade;
	
	@ManyToOne
	@JoinColumn(name = "idCompra")
	private Compra compra;
	
	public Produto() {
		super();
	}


	public Produto(Integer idProduto, String nome, Integer quantidade, Integer tipo, Integer situacao, Date validade,
			Compra compra) {
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

	public String getTipo() {
		return TipoProduto.toEnum(tipo);
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getSituacao() {
		return SituacaoProduto.toEnum(situacao);
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
	
	
	
	public Compra getCompra() {
		return compra;
	}


	public void setCompra(Compra compra) {
		this.compra = compra;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idProduto);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(idProduto, other.idProduto);
	}
	
}
