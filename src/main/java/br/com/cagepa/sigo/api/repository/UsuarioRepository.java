package br.com.cagepa.sigo.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cagepa.sigo.api.modelo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
		
	List<Usuario> findAll();
	
	Optional<Usuario> findById(Long id);
	
	List<Usuario> findByNome(String nome);

}
