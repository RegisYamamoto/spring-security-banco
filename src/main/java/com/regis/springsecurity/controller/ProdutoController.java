package com.regis.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regis.springsecurity.model.Produto;
import com.regis.springsecurity.service.ProdutoService;

@RestController
@RequestMapping(value = "v1")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping(path = "protected/produtos")
	public List<Produto> listarTodoslistarTodosOsProdutos(@AuthenticationPrincipal UserDetails userDetails) {
		System.out.println(userDetails);
		return produtoService.listarTodosOsProdutos();
	}
	
	@PostMapping(path = "admin/produtos")
	public void cadastrarProduto(@RequestBody Produto produto) {
		produtoService.cadastrarProduto(produto);
	}
	
}