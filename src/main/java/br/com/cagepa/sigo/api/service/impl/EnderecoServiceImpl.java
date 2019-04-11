package br.com.cagepa.sigo.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cagepa.sigo.api.modelo.Endereco;
import br.com.cagepa.sigo.api.repository.EnderecoRepoitory;
import br.com.cagepa.sigo.api.service.EnderecoService;

@Service
public class EnderecoServiceImpl implements EnderecoService{

	@Autowired
	EnderecoRepoitory repository;
	
	@Override
	public Endereco cadastrar(Endereco endereco) {
		return repository.save(endereco);
	}
	
	

}
