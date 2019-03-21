package br.com.cagepa.sigo.api.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cagepa.sigo.api.modelo.Ocorrencia;
import br.com.cagepa.sigo.api.service.OcorrenciaService;
import lombok.Getter;
import lombok.Setter;

@RestController
@Getter 
@Setter
public class OcorrenciaController {
	
	@Autowired
	private OcorrenciaService ocorrenciaService;
	
	
	
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
	
	
	 	@RequestMapping(method=RequestMethod.GET,
	 			value="ocorrencias/{id}",
	 			produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Ocorrencia> MostraOcorrencias(@PathVariable(value="id", required=true) Long id) {
		 
		 if(id < 0 ) { 
			 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		 }
		 try {
			 Ocorrencia ocorrencia = ocorrenciaService.getProductByIds(id).get();
			 //ObjectMapper mapper = new ObjectMapper();
			 
			 
			 return new ResponseEntity<Ocorrencia>(ocorrencia, HttpStatus.OK);
		 }catch(NoSuchElementException e) {
			 e.printStackTrace();
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 }catch(Exception e ) { 
			 e.printStackTrace();
			 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		 }
	        
	    }
	 
	 	 




}
