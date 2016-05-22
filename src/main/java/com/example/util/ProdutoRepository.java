package com.example.util;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelo.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{

	
}
