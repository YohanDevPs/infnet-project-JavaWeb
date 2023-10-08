package br.edu.infnet.appfazenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.service.AgrotoxicosService;

@Controller
public class AgrotoxicosController {
	
	@Autowired
	private AgrotoxicosService agrotoxicosService;

	@GetMapping(value = "/agrotoxico/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaAgrotoxico", agrotoxicosService.obterLista(usuario));
		
		return "agrotoxico/lista";
	}

	@GetMapping(value = "/agrotoxico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		agrotoxicosService.excluir(id);

		return "redirect:/agrotoxico/lista";
	}
}	