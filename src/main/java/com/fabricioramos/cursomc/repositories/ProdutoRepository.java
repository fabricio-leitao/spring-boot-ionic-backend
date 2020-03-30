package com.fabricioramos.cursomc.repositories;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabricioramos.cursomc.domain.Categoria;
import com.fabricioramos.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	//Usando nomes do spring data
	Page<Produto> findDinstinctByNomeContainingAndCategoriasIn(String nome, List<Categoria> categorias, Pageable pageRequest);
		
	//Utilizando a query com o nome data, o @Query tem prioridade. SPQL
	/*
	  		@Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat WHERE
			obj.nome LIKE %:nome% AND cat IN :categorias")
			Page<Produto> findDistinctByNomeContainingAndCategoriasIn(
			@Param("nome") String nome,
			@Param("categorias") List<Categoria> categorias,
			Pageable pageRequest);
	*/
}
