package br.edu.infnet.appfazenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.service.SementeService;

@Controller
public class SementeController {
	
	@Autowired
	private SementeService sementeService;

	@GetMapping(value = "/semente/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaSemente", sementeService.obterLista(usuario));
		
		return "semente/lista";
	}

	@GetMapping(value = "/semente/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		sementeService.excluir(id);

		return "redirect:/semente/lista";
	}
}	