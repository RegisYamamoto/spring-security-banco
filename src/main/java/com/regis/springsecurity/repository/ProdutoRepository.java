package com.regis.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regis.springsecurity.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
}