package br.com.cagepa.sigo.api.service;

import org.springframework.stereotype.Service;

import br.com.cagepa.sigo.api.modelo.Endereco;

@Service
public interface EnderecoService {
	
	Endereco cadastrar(Endereco endereco);

}
