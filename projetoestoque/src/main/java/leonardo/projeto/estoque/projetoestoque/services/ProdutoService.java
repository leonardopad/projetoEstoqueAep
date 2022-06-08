package leonardo.projeto.estoque.projetoestoque.services;

import java.util.List;

import leonardo.projeto.estoque.projetoestoque.domain.Produto;

public interface ProdutoService {

	List<Produto> listar();

	Produto salvar(Produto produto);

	Produto buscarPorId(Integer idProduto);

}
