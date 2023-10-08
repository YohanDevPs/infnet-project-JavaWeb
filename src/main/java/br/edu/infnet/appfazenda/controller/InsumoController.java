package br.edu.infnet.appfazenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.service.InsumoService;

@Controller
public class InsumoController {
	
	@Autowired
	private InsumoService insumoService;

	@GetMapping(value = "/insumo/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listaInsumo", insumoService.obterLista(usuario));
		return "insumo/lista";
	}

	@GetMapping(value = "/insumo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		insumoService.excluir(id);
		return "redirect:/insumo/lista";
	}
}	