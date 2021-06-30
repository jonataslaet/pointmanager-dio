package com.digitalinnovation.one.pointmanagerdio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalinnovation.one.pointmanagerdio.domain.JornadaTrabalho;
import com.digitalinnovation.one.pointmanagerdio.services.JornadaTrabalhoService;

@RestController
@RequestMapping("/jornadas")
public class JornadaTrabalhoController {

	@Autowired
	private JornadaTrabalhoService jornadaTrabalhoService;
	
	@GetMapping
	public ResponseEntity<List<JornadaTrabalho>> findAll(){
		return jornadaTrabalhoService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<JornadaTrabalho> find(@PathVariable("id") Long id){
		return jornadaTrabalhoService.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<JornadaTrabalho> insert(@RequestBody JornadaTrabalho jornadaTrabalho){
		return jornadaTrabalhoService.insert(jornadaTrabalho);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> update(@PathVariable("id") Long id, @RequestBody JornadaTrabalho jornadaTrabalho){
		return jornadaTrabalhoService.update(id, jornadaTrabalho);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<JornadaTrabalho> deleteById(@PathVariable("id") Long id){
		return jornadaTrabalhoService.deleteById(id);
	}
}
