package br.com.cagepa.sigo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cagepa.sigo.api.modelo.Ocorrencia;
import br.com.cagepa.sigo.api.service.OcorrenciaService;

@RestController()
public class OcorrenciaController {
	
	@Autowired
	OcorrenciaService ocorrenciaService;
	
	@RequestMapping(method=RequestMethod.POST, value="/cadastrar")
	public Ocorrencia cadastrarOcorrencia(@RequestBody Ocorrencia ocorrencia) {
		
			System.out.println(ocorrencia.getDescricao());
			
			Ocorrencia retorno = ocorrenciaService.cadastrar(ocorrencia);
			
			return retorno;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/teste")
	public void testar(@RequestParam String teste) {
		
		System.out.println("Testando");
		System.out.println("parametro: " + teste);
		
	}

}
