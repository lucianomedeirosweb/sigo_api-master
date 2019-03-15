package br.com.cagepa.sigo.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cagepa.sigo.api.modelo.Usuario;
import br.com.cagepa.sigo.api.repository.UsuarioRepository;
import br.com.cagepa.sigo.api.service.UsuarioService;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario cadastrar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}


}
