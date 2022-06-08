package leonardo.projeto.estoque.projetoestoque.services.defaultservices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import leonardo.projeto.estoque.projetoestoque.domain.Produto;
import leonardo.projeto.estoque.projetoestoque.model.repositories.ProdutoRepository;

import leonardo.projeto.estoque.projetoestoque.services.ProdutoService;

@Service
public class ProdutoDefaultService implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Produto> listar() {
		List<Produto> produto = produtoRepository.findAll();
		return produto;
	}


	@Override
	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}


	@Override
	@Transactional(readOnly=true)
	public Produto buscarPorId(Integer idProduto) {
		Optional<Produto> produto = produtoRepository.findById(idProduto);
		return produto.orElseThrow();
	}

	

}
