package com.digitalinnovation.one.pointmanagerdio.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.digitalinnovation.one.pointmanagerdio.domain.JornadaTrabalho;
import com.digitalinnovation.one.pointmanagerdio.repositories.JornadaTrabalhoRepository;

@Service
public class JornadaTrabalhoService {

	@Autowired
	private JornadaTrabalhoRepository jornadaTrabalhoRepository;
	
	public ResponseEntity<JornadaTrabalho> insert(JornadaTrabalho jornadaTrabalho) {
		
		JornadaTrabalho jornadaSalva = jornadaTrabalhoRepository.save(jornadaTrabalho);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(jornadaSalva.getId())
				.toUri();
		
		return ResponseEntity.created(uri).body(jornadaSalva);
	}

	public ResponseEntity<List<JornadaTrabalho>> findAll() {
		return ResponseEntity.ok(jornadaTrabalhoRepository.findAll());
	}

	public ResponseEntity<JornadaTrabalho> findById(Long id) {
		JornadaTrabalho jornadaTrabalhoEncontrada = findOneById(id);
		if (jornadaTrabalhoEncontrada == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(jornadaTrabalhoEncontrada);
	}

	private JornadaTrabalho findOneById(Long id) {
		Optional<JornadaTrabalho> jornadaEncontrada = jornadaTrabalhoRepository.findById(id);
		
		if (!jornadaEncontrada.isPresent()) {
			return null;
		}
		
		return jornadaEncontrada.get();		
	}

	public ResponseEntity<Void> update(Long id, JornadaTrabalho jornadaTrabalho) {
		JornadaTrabalho jornadaTrabalhoEncontrada = findOneById(id);
		
		if (jornadaTrabalhoEncontrada == null) {
			return ResponseEntity.notFound().build();
		}
		
		updateObject(jornadaTrabalhoEncontrada, jornadaTrabalho);
		jornadaTrabalhoRepository.save(jornadaTrabalhoEncontrada);
		return ResponseEntity.noContent().build();
	}
	
	private void updateObject(JornadaTrabalho jornadaAtualizada, JornadaTrabalho jornadaAtualizadora) {
		if (jornadaAtualizadora.getDescricao() != null) {
			jornadaAtualizada.setDescricao(jornadaAtualizadora.getDescricao());
		}
		if (jornadaAtualizadora.getId() != null) {
			jornadaAtualizada.setId(jornadaAtualizadora.getId());
		}
	}

	public ResponseEntity<JornadaTrabalho> deleteById(Long id) {
		JornadaTrabalho jornada = findOneById(id);
		if (jornada == null) {
			return ResponseEntity.notFound().build();
		}
		jornadaTrabalhoRepository.deleteById(id);
		return ResponseEntity.noContent().build(); 
	}
}
