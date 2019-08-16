package br.com.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.academia.daos.ExercicioDAO;
import br.com.academia.models.ExercicioModel;

@Controller
public class ExercicioController {
	@Autowired
	private ExercicioDAO exercicioDao;
	
	@RequestMapping("/Exercicio/formu")
	public String form() {
		System.out.println("Gravando exercício");
		return "Exercicio/formu";
	}
	@RequestMapping("/Exercicio")
	public String save(ExercicioModel exercicio) {
		exercicioDao.save(exercicio);
		
		return "Exercicio/ok";
	}
}