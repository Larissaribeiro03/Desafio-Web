package com.desafio.itau.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.itau.model.Categoria;

@Repository
public interface categoriasRepository extends JpaRepository<Categoria,Long>{
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);

}
