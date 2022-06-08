package leonardo.projeto.estoque.projetoestoque.services;
import java.util.List;

import leonardo.projeto.estoque.projetoestoque.domain.Fornecedor;
public interface FornecedorService {

	List<Fornecedor> listar();

	Fornecedor salvar(Fornecedor fornecedor);

	Fornecedor buscarPorId(Integer idFornecedor);

}
