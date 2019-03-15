
package br.com.cagepa.sigo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cagepa.sigo.api.modelo.Usuario;
import br.com.cagepa.sigo.api.repository.UsuarioRepository;
import br.com.cagepa.sigo.api.service.UsuarioService;

@RestController()
public class UsuarioController {
	
	@Autowired
	UsuarioService  usuarioService;
	
	@Autowired
    UsuarioRepository usuarioRepository;
	
	@RequestMapping(method=RequestMethod.POST, value="/CadastrarUsuario")
	public Usuario CadastrarUsuario(@RequestBody Usuario usuario) {
		
		
		Usuario retorno = usuarioService.cadastrar(usuario);
			
			return retorno;
	}
	
	 
	
	
	

}
