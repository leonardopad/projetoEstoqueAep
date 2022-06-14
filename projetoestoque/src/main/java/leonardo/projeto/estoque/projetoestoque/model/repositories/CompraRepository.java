package leonardo.projeto.estoque.projetoestoque.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import leonardo.projeto.estoque.projetoestoque.domain.Compra;

public interface CompraRepository extends JpaRepository<Compra, Integer> {

}
