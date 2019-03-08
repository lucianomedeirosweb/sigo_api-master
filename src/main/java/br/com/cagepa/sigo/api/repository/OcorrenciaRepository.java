package br.com.cagepa.sigo.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cagepa.sigo.api.modelo.Ocorrencia;

@Repository
public interface OcorrenciaRepository extends CrudRepository<Ocorrencia, Long>{
	
	List<Ocorrencia> findAll();
	
	Optional<Ocorrencia> findById(Long id);
	
	List<Ocorrencia> findByDescricao(String descricao);
	

}
