package leonardo.projeto.estoque.projetoestoque.services.defaultservices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import leonardo.projeto.estoque.projetoestoque.domain.Compra;
import leonardo.projeto.estoque.projetoestoque.domain.Produto;
import leonardo.projeto.estoque.projetoestoque.model.DTO.CompraDTO;
import leonardo.projeto.estoque.projetoestoque.model.DTO.ProdutoDTO;
import leonardo.projeto.estoque.projetoestoque.model.repositories.CompraRepository;
import leonardo.projeto.estoque.projetoestoque.model.repositories.ProdutoRepository;
import leonardo.projeto.estoque.projetoestoque.services.CompraService;
import leonardo.projeto.estoque.projetoestoque.services.FornecedorService;

@Service
public class CompraDefaultService implements CompraService {

	
	@Autowired
	CompraRepository compraRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;
	@Autowired
	FornecedorService fornecedorService; 
	
	@Override
	@Transactional(readOnly = true)
	public List<Compra> listar() {
		List<Compra> compra = compraRepository.findAll(); 
		return compra;
	}

	@Override
	public Compra salvar(Compra compra) {
		compra.setIdCompra(null);
		compra = compraRepository.save(compra);
		produtoRepository.saveAll(compra.getProduto());
		return compra;
	}
	

	@Override
	@Transactional(readOnly = true)
	public Compra buscarPorId(Integer idCompra) {
		Optional<Compra> compra = compraRepository.findById(idCompra);
		return compra.orElseThrow();
	}

	@Override
	public Compra fromDTO(CompraDTO compraDto) {
		Compra com = new Compra();
		com.setFornecedor(fornecedorService.buscarPorId(compraDto.getFornecedor()));
		for(ProdutoDTO produtoDto : compraDto.getProduto()) {
			Produto pro = new Produto();
			pro.setIdProduto(null);
			pro.setNome(produtoDto.getNome());
			pro.setQuantidade(produtoDto.getQuantidade());
			pro.setSituacao(produtoDto.getSituacao());
			pro.setTipo(produtoDto.getTipo());
			pro.setValidade(produtoDto.getValidade());
			pro.setCompra(com);
			com.getProduto().add(pro);
		}
		return com;
	}
}
