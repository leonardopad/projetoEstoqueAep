package leonardo.projeto.estoque.projetoestoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import leonardo.projeto.estoque.projetoestoque.domain.Produto;
import leonardo.projeto.estoque.projetoestoque.services.ProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping()
	public String Listar(Model model) {
		model.addAttribute("produtos", produtoService.listar());
		return "produto/listaProdutos";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar(Model model){
		Produto prod = new Produto();
		model.addAttribute("produto", prod);
		return "produto/cadastrar";
	}
	
	@PostMapping("/salvar")
	public String cadastrar(Produto produto) {
		produtoService.salvar(produto);
		return "redirect:/produto";
	}
	
	@GetMapping("/alterarCadastro/{id}")
	public String alterar(Model model, @PathVariable(value="id") Integer idProduto){
		Produto produto = produtoService.buscarPorId(idProduto);
		model.addAttribute("produto", produto);
		return "produto/cadastrar";
	}
	
}
