package leonardo.projeto.estoque.projetoestoque.services;

import java.util.List;

import leonardo.projeto.estoque.projetoestoque.domain.Compra;
import leonardo.projeto.estoque.projetoestoque.domain.Produto;

public interface CompraService {

	List<Compra> listar();

	void salvar(Compra compra, List<Produto> produto);

	Compra buscarPorId(Integer idCompra);

}
