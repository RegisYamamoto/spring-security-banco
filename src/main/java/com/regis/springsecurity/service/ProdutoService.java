package com.regis.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regis.springsecurity.model.Produto;
import com.regis.springsecurity.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> listarTodosOsProdutos() {
		return produtoRepository.findAll();
	}
	
	public void cadastrarProduto(Produto produto) {
		produtoRepository.save(produto);
	}
	
}