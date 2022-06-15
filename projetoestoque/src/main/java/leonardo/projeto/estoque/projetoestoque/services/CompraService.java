package leonardo.projeto.estoque.projetoestoque.services;

import java.util.List;

import leonardo.projeto.estoque.projetoestoque.domain.Compra;
import leonardo.projeto.estoque.projetoestoque.domain.Produto;
import leonardo.projeto.estoque.projetoestoque.model.DTO.CompraDTO;

public interface CompraService {

	List<Compra> listar();

	Compra salvar(Compra compra);

	Compra buscarPorId(Integer idCompra);
	
	Compra fromDTO(CompraDTO compraDto);

}
