package br.com.cagepa.sigo.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	
	@RequestMapping(method=RequestMethod.POST, value="/cadastrarOcorrencia")
	public Ocorrencia cadastrarOcorrencia(@RequestBody Ocorrencia ocorrencia) {
		
		
			Ocorrencia retorno = ocorrenciaService.cadastrar(ocorrencia);
			
			return retorno;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/teste")
	public void testar(@RequestParam String teste) {
		
		System.out.println("Testando");
		System.out.println("parametro: " + teste);
		
	}
	
	
	 @RequestMapping(method=RequestMethod.POST,value="ocorrencias/{id}")
	    public Optional<Ocorrencia> MostraOcorrencias(@PathVariable Long id, Model model) {
		 
		 Optional<Ocorrencia> ocorrencia = ocorrenciaService.getProductByIds(id);
	        return ocorrencia;
	    }
	 
	 	 
	 
	 @RequestMapping(method=RequestMethod.POST,value="ocorrencia/{id}")
	    public String MostraOcorrencia(@PathVariable Long id, Model model) {
		 
	        model.addAttribute("Ocorrencia", ocorrenciaService.getProductById(id));
	       return "Ocorrencia";
	    }
	 
	 



}
