package br.com.cagepa.sigo.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.cagepa.sigo.api.modelo.Ocorrencia;

@Service
public interface OcorrenciaService{
	
	public Ocorrencia cadastrar(Ocorrencia ocorrencia);
	
	public  Optional<Ocorrencia> getProductById(Long id);

	public Optional<Ocorrencia> getProductByIds(Long id);

	public void deletar(Long id);
	
	public List<Ocorrencia> findAllByEndereco(String endereco);
	
	
	

	
	
	
	
}
