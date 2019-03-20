package br.com.cagepa.sigo.api.service;

import java.util.Optional;

import br.com.cagepa.sigo.api.modelo.Ocorrencia;

public interface OcorrenciaService{
	
	public Ocorrencia cadastrar(Ocorrencia ocorrencia);
	
	public  Optional<Ocorrencia> getProductById(Long id);

	Optional<Ocorrencia> getProductByIds(Long id);


	
	
	
	
}
