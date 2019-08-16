package br.com.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.academia.daos.TreinoDAO;
import br.com.academia.models.TreinoModel;

@Controller
public class TreinoController {
	@Autowired
	private TreinoDAO treinoDao;
	
	@RequestMapping("/Treino/form")
	public String form() {
		System.out.println("Gravando treino");
		return "Treino/form";
	}
	@RequestMapping("/Treino")
	public String save(TreinoModel treino) {
		treinoDao.save(treino);
		
		return "Treino/ok";
	}
}