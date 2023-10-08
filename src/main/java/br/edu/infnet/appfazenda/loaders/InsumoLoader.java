package br.edu.infnet.appfazenda.loaders;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfazenda.enums.TipoAgrotoxico;
import br.edu.infnet.appfazenda.enums.TipoFertilizante;
import br.edu.infnet.appfazenda.enums.TipoSemente;
import br.edu.infnet.appfazenda.model.domain.Agrotoxico;
import br.edu.infnet.appfazenda.model.domain.Fazenda;
import br.edu.infnet.appfazenda.model.domain.Fertilizante;
import br.edu.infnet.appfazenda.model.domain.Insumo;
import br.edu.infnet.appfazenda.model.domain.Semente;
import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.service.FazendaService;
import br.edu.infnet.appfazenda.model.service.InsumoService;

@Order(3)
@Component
public class InsumoLoader implements ApplicationRunner {
	
	@Autowired
	private InsumoService insumoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("arquivos/insumo.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";"); 
			
			switch (campos[6]) {
			case "S":
				Semente semente = new Semente(
						campos[0],
						Float.valueOf(1),
						campos[2],
						Enum.valueOf(TipoSemente.class, campos[3]),
						Float.valueOf(4)
					);	
				
				semente.setUsuario(new Usuario(Integer.valueOf(campos[5])));

				insumoService.incluir(semente);				
				break;

			case "A":
				Agrotoxico agrotoxico = new Agrotoxico(
						campos[0],
						Float.valueOf(1),
						campos[2],
						Enum.valueOf(TipoAgrotoxico.class, campos[3]),
						Float.valueOf(4)
					);
				
				agrotoxico.setUsuario(new Usuario(Integer.valueOf(campos[5])));

				insumoService.incluir(agrotoxico);
				break;

			case "F":
				Fertilizante fertilizante = new Fertilizante(
						campos[0],
						Float.valueOf(1),
						campos[2],
						Enum.valueOf(TipoFertilizante.class, campos[3]),
						Float.valueOf(4)
					);
				
				fertilizante.setUsuario(new Usuario(Integer.valueOf(campos[5])));

				insumoService.incluir(fertilizante);
				break;
			
			default:
				break;
			}
			
			linha = leitura.readLine();
		}

		leitura.close();		
	}
}