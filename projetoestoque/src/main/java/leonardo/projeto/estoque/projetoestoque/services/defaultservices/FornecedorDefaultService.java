package leonardo.projeto.estoque.projetoestoque.services.defaultservices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import leonardo.projeto.estoque.projetoestoque.domain.Fornecedor;
import leonardo.projeto.estoque.projetoestoque.services.FornecedorService;
import leonardo.projeto.estoque.projetoestoque.model.repositories.FornecedorRepository;
@Service
public class FornecedorDefaultService implements FornecedorService{

	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Fornecedor> listar() {
		List<Fornecedor> fornecedor = fornecedorRepository.findAll();
		return fornecedor;
	}

	@Override
	@Transactional
	public Fornecedor salvar(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}
	
	
	@Override
	@Transactional(readOnly = true)
	public Fornecedor buscarPorId(Integer idFornecedor) {
		Optional<Fornecedor> fornecedor = fornecedorRepository.findById(idFornecedor);
		return fornecedor.orElseThrow();
	}

}
