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
	public String hello(){
		Produto p = new Produto();
		p.setNome("P1");
		p.setPreco(3.40);
		
		Produto p2 = new Produto();
		p2.setNome("P2");
		p2.setPreco(24.30);
		
		Produto p3 = new Produto();
		p3.setNome("PX");
		p3.setPreco(54.20);
		
		rep.save(p);
		rep.save(p2);
		rep.save(p3);
		
		Logger log = Logger.getRootLogger();
		
		log.info("--------- Info Produtos ---------");
		for(Produto prod : rep.findAll())
			log.info(prod.getNome() + " " + prod.getPreco() + " " + prod.getId());
		
		return "index";
	}
}
