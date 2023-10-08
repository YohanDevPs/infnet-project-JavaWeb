package br.edu.infnet.appfazenda.loaders;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfazenda.model.domain.Fazenda;
import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.service.FazendaService;

@Order(2)
@Component
public class FazendaLoaders implements ApplicationRunner {
	
	@Autowired
	private FazendaService fazendaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("arquivos/fazenda.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";"); 

			Fazenda fazenda = new Fazenda(
					campos[0], 
					Boolean.valueOf(campos[1]), 
					campos[2]
				);	
			fazenda.setUsuario(new Usuario(1));

			fazendaService.incluir(fazenda);
			
			linha = leitura.readLine();
		}

		leitura.close();			
	}
}