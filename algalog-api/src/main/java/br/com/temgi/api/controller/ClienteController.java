package br.com.temgi.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.temgi.domain.model.Cliente;
import br.com.temgi.domain.repository.ClienteRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class ClienteController {

//	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping("/clientes")
	public List<Cliente> listar() {
//		return clienteRepository.findAll();
//		return clienteRepository.findByNome("Maria Abadia");
		return clienteRepository.findByNomeContaining("a");
	}
}
