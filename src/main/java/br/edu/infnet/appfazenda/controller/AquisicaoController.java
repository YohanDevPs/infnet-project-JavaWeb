package br.edu.infnet.appfazenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appfazenda.model.domain.Aquisicao;
import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.service.AquisicaoService;
import br.edu.infnet.appfazenda.model.service.FazendaService;
import br.edu.infnet.appfazenda.model.service.InsumoService;

@Controller
public class AquisicaoController {
	
	@Autowired
	private AquisicaoService aquisicaoService;
	@Autowired
	private FazendaService fazendaService;	
	@Autowired
	private InsumoService insumoService;
	
	
	@GetMapping(value = "/aquisicao")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("fazendas", fazendaService.obterLista(usuario));

		model.addAttribute("insumos", insumoService.obterLista(usuario));
		
		return "aquisicao/cadastro";
	}
	

	@GetMapping(value = "/aquisicao/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		model.addAttribute("listaAquisicao", aquisicaoService.obterLista(usuario));
		
		return "aquisicao/lista";
	}

	@GetMapping(value = "/aquisicao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		aquisicaoService.excluir(id);

		return "redirect:/aquisicao/lista";
	}
	
	@PostMapping(value = "/aquisicao/incluir")
	public String incluir(Aquisicao aquisicao, @SessionAttribute("user") Usuario usuario) {
		
		aquisicao.setUsuario(usuario);
		
		aquisicaoService.incluir(aquisicao);
		
		return "redirect:/aquisicao/lista";
	}
}	