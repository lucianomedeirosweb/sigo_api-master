package br.com.cagepa.sigo.api.service;

import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.cagepa.sigo.api.modelo.Ocorrencia;
import br.com.cagepa.sigo.api.repository.OcorrenciaRepository;

@Service
public interface OcorrenciaService{
	
	public Ocorrencia cadastrar(Ocorrencia ocorrencia);
	
	public  Optional<Ocorrencia> getProductById(Long id);

	public Optional<Ocorrencia> getProductByIds(Long id);

	public void deletar(Long id);

	
	
	
	
}
