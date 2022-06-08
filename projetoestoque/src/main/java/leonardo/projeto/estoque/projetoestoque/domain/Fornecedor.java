package leonardo.projeto.estoque.projetoestoque.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFornecedor;
	
	private String cnpj;
	private String nomeFornecedor;
	private Integer compras;
	
	public Fornecedor() {
		super();
	}

	public Fornecedor(Integer idFornecedor, String cnpj, String nomeFornecedor, Integer compras) {
		super();
		this.idFornecedor = idFornecedor;
		this.cnpj = cnpj;
		this.nomeFornecedor = nomeFornecedor;
		this.compras = compras;
	}

	public Integer getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Integer idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public Integer getCompras() {
		return compras;
	}

	public void setCompras(Integer compras) {
		this.compras = compras;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idFornecedor);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(idFornecedor, other.idFornecedor);
	}
	
}
