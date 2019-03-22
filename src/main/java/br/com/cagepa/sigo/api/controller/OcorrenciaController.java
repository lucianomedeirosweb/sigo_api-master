package br.com.cagepa.sigo.api.controller;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.cagepa.sigo.api.modelo.Ocorrencia;
import br.com.cagepa.sigo.api.repository.OcorrenciaRepository;
import br.com.cagepa.sigo.api.service.OcorrenciaService;
import lombok.Getter;
import lombok.Setter;

@RestController
@Getter
@Setter
public class OcorrenciaController {

	@Autowired
	private OcorrenciaService ocorrenciaService;
	
	@Autowired
	OcorrenciaRepository ocorrenciarepository;

	// CAGEPA - SIGO - Cadastrando a ocorrência
	@RequestMapping(method = RequestMethod.POST, value = "/cadastrarOcorrencia")
	public Ocorrencia cadastrarOcorrencia(@RequestBody Ocorrencia ocorrencia) {

		Ocorrencia retorno = ocorrenciaService.cadastrar(ocorrencia);

		return retorno;
	}

	// CAGEPA - SIGO - Listando a Ocorrência
	@RequestMapping(method = RequestMethod.GET, value = "listarOcorrencia/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Ocorrencia> MostraOcorrencias(@PathVariable(value = "id", required = true) Long id) {

		if (id < 0) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		try {
			Ocorrencia ocorrencia = ocorrenciaService.getProductByIds(id).get();
			// ObjectMapper mapper = new ObjectMapper();

			return new ResponseEntity<Ocorrencia>(ocorrencia, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	// CAGEPA - SIGO - Atualizar Ocorrencia
	@PutMapping("/atualizarOcorrencia/{id}")
	public ResponseEntity<Object> AtualizarOcorrencia(@RequestBody Ocorrencia ocorrencia, @PathVariable long id) {

		Optional<Ocorrencia> ocorrenciaOptional = ocorrenciarepository.findById(id);

		if (!ocorrenciaOptional.isPresent())
			return ResponseEntity.notFound().build();

		ocorrencia.setId(id);
		
		ocorrenciarepository.save(ocorrencia);

		return ResponseEntity.noContent().build();
	}
	
	
	

	// CAGEPA - SIGO - deletando a ocorrência
	@RequestMapping(method = RequestMethod.GET, value = "deletarOcorrencia/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletar(@PathVariable Long id) {
		ocorrenciaService.deletar(id);
	}
}
