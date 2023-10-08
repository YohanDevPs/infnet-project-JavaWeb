package br.edu.infnet.appfazenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.service.FertilizanteService;

@Controller
public class FertilizanteController {

	@Autowired
	private FertilizanteService fertilizanteService;

	@GetMapping(value = "/fertilizante/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaFertilizante", fertilizanteService.obterLista(usuario));
		
		return "fertilizante/lista";
	}

	@GetMapping(value = "/fertilizante/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		fertilizanteService.excluir(id);

		return "redirect:/fertilizante/lista";
	}
}	