package leonardo.projeto.estoque.projetoestoque.services.defaultservices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import leonardo.projeto.estoque.projetoestoque.domain.Colaborador;
import leonardo.projeto.estoque.projetoestoque.model.repositories.ColaboradorRepository;
import leonardo.projeto.estoque.projetoestoque.services.ColaboradorService;
@Service
public class ColaboradorDefaultService implements ColaboradorService {
	
	@Autowired
	private ColaboradorRepository colaboradorRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Colaborador> listar() {
		List<Colaborador> colaborador = colaboradorRepository.findAll();
		return colaborador;
	}

	@Override
	@Transactional
	public Colaborador salvar(Colaborador colaborador) {
		
		return colaboradorRepository.save(colaborador);
	}

	@Override
	@Transactional(readOnly = true)
	public Colaborador buscarPorId(Integer idColaborador) {
		Optional<Colaborador> colaborador = colaboradorRepository.findById(idColaborador);
		return colaborador.orElseThrow();
	}
	
	
}
