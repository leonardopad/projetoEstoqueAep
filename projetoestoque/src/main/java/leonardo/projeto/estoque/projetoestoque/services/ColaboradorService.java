package leonardo.projeto.estoque.projetoestoque.services;

import java.util.List;

import leonardo.projeto.estoque.projetoestoque.domain.Colaborador;

public interface ColaboradorService {

	List<Colaborador> listar();

	Colaborador salvar(Colaborador colaborador);

	Colaborador buscarPorId(Integer idColaborador);
	
}
