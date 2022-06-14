package leonardo.projeto.estoque.projetoestoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import leonardo.projeto.estoque.projetoestoque.domain.Compra;
import leonardo.projeto.estoque.projetoestoque.domain.Fornecedor;
import leonardo.projeto.estoque.projetoestoque.domain.Produto;
import leonardo.projeto.estoque.projetoestoque.services.CompraService;
import leonardo.projeto.estoque.projetoestoque.services.FornecedorService;
import leonardo.projeto.estoque.projetoestoque.services.ProdutoService;

@Controller
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	private CompraService compraService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private FornecedorService fornecedorService;
	
	@GetMapping
	public String listar(Model model) {
		model.addAttribute("Compras: ",compraService.listar());
		return "compra/listaCompras";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar(Model model) {
		Compra com = new Compra();
		Produto produto = new Produto();
		List<Fornecedor> fornecedorList = fornecedorService.listar();
		model.addAttribute("compra", com);
		model.addAttribute("produto", produto);
		model.addAttribute("fornecedorList", fornecedorList);
		return "compra/cadastrar";
	}
	
	@PostMapping("/salvar")
	public String salvar(Compra compra, List<Produto> produto) {
		compraService.salvar(compra, produto);
		return "redirect:compra";
	}
	
	@GetMapping("/alterarCadastro/{id}")
	public String alterar(Model model, @PathVariable(value="id") Integer idCompra){
		Compra compra = compraService.buscarPorId(idCompra);
		model.addAttribute("compra", compra);
		return "compra/cadastrar";
	}
}
