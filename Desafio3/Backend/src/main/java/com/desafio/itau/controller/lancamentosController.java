package com.desafio.itau.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.desafio.itau.model.Lancamentos;
import com.desafio.itau.repository.lancamentosRepository;

@RestController
@RequestMapping("/lancamentos")
public class lancamentosController {
	
	@Autowired
	private lancamentosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Lancamentos>>getAllLancamentos(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Lancamentos>findById(@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
}
