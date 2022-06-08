package leonardo.projeto.estoque.projetoestoque.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import leonardo.projeto.estoque.projetoestoque.domain.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {
	
}
