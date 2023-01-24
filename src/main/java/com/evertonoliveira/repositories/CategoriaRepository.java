package com.evertonoliveira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evertonoliveira.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	//interface responsável para recuperar, deletar, mostrar os dados
	
	
}
