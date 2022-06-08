package leonardo.projeto.estoque.projetoestoque.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import leonardo.projeto.estoque.projetoestoque.domain.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {

}
