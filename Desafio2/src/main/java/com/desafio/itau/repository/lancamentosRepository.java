package com.desafio.itau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.itau.model.Lancamentos;

@Repository
public interface lancamentosRepository extends JpaRepository<Lancamentos,Long>{
	

}
