package br.edu.infnet.appfazenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appfazenda.model.domain.Fazenda;
import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.service.FazendaService;

@Controller
public class FazendaController {

	@Autowired
	private FazendaService fazendaService;
	
	@GetMapping(value = "/fazenda/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		var obter = fazendaService.obterLista(usuario);
		System.out.println(obter);
		model.addAttribute("listafazenda", fazendaService.obterLista(usuario));
		
		return "fazenda/lista";
	}

	@GetMapping(value = "/fazenda/cadastro")
	public String telaCadastro() {
			
		return "fazenda/cadastro";
	}

	@PostMapping(value = "/fazenda/incluir")
	public String incluir(Fazenda fazenda, @SessionAttribute("user") Usuario usuario) {
		
		fazenda.setUsuario(usuario);
		
		fazendaService.incluir(fazenda);
		
		return "redirect:/fazenda/lista";
	}
	
	@GetMapping(value = "/fazenda/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		fazendaService.excluir(id);

		return "redirect:/fazenda/lista";
	}
}