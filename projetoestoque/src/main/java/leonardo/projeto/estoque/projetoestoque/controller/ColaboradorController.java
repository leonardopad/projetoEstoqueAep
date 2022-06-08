package leonardo.projeto.estoque.projetoestoque.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import leonardo.projeto.estoque.projetoestoque.domain.Colaborador;
import leonardo.projeto.estoque.projetoestoque.services.ColaboradorService;

@Controller
@RequestMapping("/colaborador") 
public class ColaboradorController  {
	
	@Autowired
	private ColaboradorService colaboradorService;
	
	@GetMapping()
	public String Listar(Model model){
		model.addAttribute("colaboradores", colaboradorService.listar());
		return "colaborador/listaColaboradores";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar(Model model){
		Colaborador colab = new Colaborador();
		model.addAttribute("colaborador", colab);
		return "colaborador/cadastrar";
	} 
	
	@PostMapping("/salvar")
	public String cadastrar(Model model, Colaborador colaborador) {
		colaboradorService.salvar(colaborador);
		return "redirect:/colaborador";
	}
	
	
	@GetMapping("/alterarCadastro/{id}")
	public String alterar(Model model, @PathVariable(value="id") Integer idColaborador){
		Colaborador colaborador = colaboradorService.buscarPorId(idColaborador);
		model.addAttribute("colaborador", colaborador);
		return "colaborador/alterar";
	}
	
	
}
