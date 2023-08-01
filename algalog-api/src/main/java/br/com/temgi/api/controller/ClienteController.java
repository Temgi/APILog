package br.com.temgi.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.temgi.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/testes")
	public String listaAPI() {
		return "Teste API";
	}
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("11-9999-7788");
		cliente1.setEmail("joao@temgi.com.br");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("11-9999-3355");
		cliente2.setEmail("maria@temgi.com.br");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
