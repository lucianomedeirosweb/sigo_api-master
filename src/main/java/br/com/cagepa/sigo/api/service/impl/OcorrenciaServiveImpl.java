package br.com.cagepa.sigo.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import br.com.cagepa.sigo.api.modelo.Ocorrencia;
import br.com.cagepa.sigo.api.repository.OcorrenciaRepository;
import br.com.cagepa.sigo.api.service.OcorrenciaService;

@Service
public class OcorrenciaServiveImpl implements OcorrenciaService{

	@Autowired
	OcorrenciaRepository ocorrenciaRepository;
	
	@Override
	public Ocorrencia cadastrar(Ocorrencia ocorrencia) {
		return ocorrenciaRepository.save(ocorrencia);
	}
	

	
	@Override
    public Optional<Ocorrencia> getProductById(Long id) {
        return ocorrenciaRepository.findById(id);
    }
	
	
	  @Override
	    public Optional<Ocorrencia> getProductByIds(Long id) {
	        return ocorrenciaRepository.findById(id);
	    }
	  
	  
	  
	  



	
}
