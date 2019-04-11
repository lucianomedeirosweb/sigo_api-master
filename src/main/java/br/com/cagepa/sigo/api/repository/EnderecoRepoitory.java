package br.com.cagepa.sigo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cagepa.sigo.api.modelo.Endereco;

@Repository
public interface EnderecoRepoitory extends JpaRepository<Endereco, Long>{
	
}
