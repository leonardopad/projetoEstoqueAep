package leonardo.projeto.estoque.projetoestoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import leonardo.projeto.estoque.projetoestoque.domain.Fornecedor;
import leonardo.projeto.estoque.projetoestoque.services.FornecedorService;

@Controller
@RequestMapping("/fornecedor")
public class FornecedorController {
	
	@Autowired
	private FornecedorService fornecedorService;
	
	@GetMapping()
	public String Listar(Model model) {
		model.addAttribute("fornecedores", fornecedorService.listar());
		return "fornecedor/listaFornecedores";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar(Model model){
		Fornecedor fornec = new Fornecedor();
		model.addAttribute("fornecedor", fornec);
		return "fornecedor/cadastrar";
	}
	
	@PostMapping("/salvar")
	public String cadastrar(Fornecedor fornecedor) {
		fornecedorService.salvar(fornecedor);
		return "redirect:/fornecedor";
	}
	
	@GetMapping("/alterarCadastro/{id}")
	public String alterar(Model model, @PathVariable(value="id") Integer idFornecedor){
		Fornecedor fornecedor = fornecedorService.buscarPorId(idFornecedor);
		model.addAttribute("fornecedor", fornecedor);
		return "fornecedor/cadastrar";
	}
}
