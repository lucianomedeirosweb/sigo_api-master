
package br.com.cagepa.sigo.api.controller;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.cagepa.sigo.api.modelo.Usuario;
import br.com.cagepa.sigo.api.repository.UsuarioRepository;
import br.com.cagepa.sigo.api.service.UsuarioService;

@RestController()
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@Autowired
	UsuarioRepository usuarioRepository;

	@RequestMapping(method = RequestMethod.POST, value = "/CadastrarUsuario")
	public Usuario CadastrarUsuario(@RequestBody Usuario usuario) {

		Usuario retorno = usuarioService.cadastrar(usuario);

		return retorno;
	}

	@RequestMapping(method = RequestMethod.GET, value = "listarUsuarios/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> MostrarUsuarios(@PathVariable(value = "id", required = true) Long id) {

		if (id < 0) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		try {
			Usuario usuario = usuarioService.getProductByIds(id).get();
			

			return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	@PutMapping("/atualizarUsuario/{id}")
	public ResponseEntity<Object> updatePrato(@RequestBody Usuario usuario, @PathVariable long id) {

		Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

		if (!usuarioOptional.isPresent())
			return ResponseEntity.notFound().build();

		usuario.setId(id);
		
		usuarioRepository.save(usuario);

		return ResponseEntity.noContent().build();
	}
	
	

	@RequestMapping(method = RequestMethod.GET, value = "deletarUsuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletar(@PathVariable Long id) {
		usuarioService.deletar(id);
	}

}
