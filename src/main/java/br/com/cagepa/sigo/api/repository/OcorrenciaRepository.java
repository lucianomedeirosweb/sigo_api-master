package br.com.cagepa.sigo.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cagepa.sigo.api.modelo.Ocorrencia;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long>{
	
	public List<Ocorrencia> findByEndereco(String endereco);
	
	

}
