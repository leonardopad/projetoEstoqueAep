package leonardo.projeto.estoque.projetoestoque.services.defaultservices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import leonardo.projeto.estoque.projetoestoque.domain.Compra;
import leonardo.projeto.estoque.projetoestoque.domain.Produto;
import leonardo.projeto.estoque.projetoestoque.model.repositories.CompraRepository;
import leonardo.projeto.estoque.projetoestoque.model.repositories.ProdutoRepository;
import leonardo.projeto.estoque.projetoestoque.services.CompraService;

@Service
public class CompraDefaultService implements CompraService {

	
	@Autowired
	CompraRepository compraRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Compra> listar() {
		List<Compra> compra = compraRepository.findAll(); 
		return compra;
	}

	@Override
	public void salvar(Compra compra, List<Produto> produto) {
		for(Produto produtos : produto) {
			atualizaProduto(produtos, compra);
		}
	}
	
	private void atualizaProduto(Produto produto, Compra compra){
		produto.setValidade(produto.getValidade());
		produto.setQuantidade(produto.getQuantidade());
		
	}

	@Override
	@Transactional(readOnly = true)
	public Compra buscarPorId(Integer idCompra) {
		Optional<Compra> compra = compraRepository.findById(idCompra);
		return compra.orElseThrow();
	}
	
}
