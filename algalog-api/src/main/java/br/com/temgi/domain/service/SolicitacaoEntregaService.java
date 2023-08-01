package br.com.temgi.domain.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.temgi.domain.model.Cliente;
import br.com.temgi.domain.model.Entrega;
import br.com.temgi.domain.model.StatusEntrega;
import br.com.temgi.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {
	
//	private ClienteRepository clienteRepository;
	private CatalogoClienteService catalogoClienteService;
	private EntregaRepository entregaRepository;

	@Transactional
	public Entrega solicitar(Entrega entrega) {
		Cliente cliente = catalogoClienteService.buscar(entrega.getCliente().getId());

		entrega.setCliente(cliente);
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(LocalDateTime.now());

		return entregaRepository.save(entrega);
	}
}
