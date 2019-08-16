package br.com.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.academia.daos.CategoriaDAO;
import br.com.academia.models.CategoriaModel;

@Controller
public class CategoriaController {
	@Autowired
	private CategoriaDAO categoriaDao;
	
	@RequestMapping("/Categoria/form")
	public String form() {
		System.out.println("Gravando categoria");
		return "Categoria/form";
	}
	@RequestMapping("/Categoria")
	public String save(CategoriaModel categoria) {
		categoriaDao.save(categoria);
		
		return "Categoria/ok";
	}
}