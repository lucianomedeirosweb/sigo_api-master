package br.com.cagepa.sigo.api.service;

import java.util.Optional;

import br.com.cagepa.sigo.api.modelo.Ocorrencia;
import br.com.cagepa.sigo.api.modelo.Usuario;

public interface UsuarioService {

	public Usuario cadastrar(Usuario usuario);

	
	public Optional<Usuario> getProductByIds(Long id);
	public void deletar(Long id);
	
}
