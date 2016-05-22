package com.example.controller;

import javax.persistence.EntityManager;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.modelo.Produto;
import com.example.util.JPAUtil;
import com.example.util.ProdutoRepository;

@Controller
public class TesteController {
	@Autowired
	ProdutoRepository rep;
	
	@RequestMapping("/")
	public String index(){
		
		return "index";
	}
	
	@RequestMapping("/hello")
	public String hello(){
		
		return "hello";
	}
}
