package leonardo.projeto.estoque.projetoestoque.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import leonardo.projeto.estoque.projetoestoque.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
}
