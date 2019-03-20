package br.com.cagepa.sigo.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cagepa.sigo.api.modelo.Ocorrencia;

@Repository
public interface OcorrenciaRepository extends CrudRepository<Ocorrencia, Long>{
	
	List<Ocorrencia> findAll();	
	
	
	Ocorrencia findByDescricao(String descricao);
	
	Ocorrencia getProductById(Long Id);
	


}
