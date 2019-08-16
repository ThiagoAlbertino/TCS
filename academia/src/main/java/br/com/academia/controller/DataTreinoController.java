package br.com.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.academia.daos.DataTreinoDAO;
import br.com.academia.models.DataTreinoModel;

@Controller
public class DataTreinoController {
	@Autowired
	private DataTreinoDAO datatreinoDao;
	
	@RequestMapping("/DataTreino/form")
	public String form() {
		System.out.println("Gravando data do treino");
		return "DataTreino/form";
	}
	@RequestMapping("/DataTreino")
	public String save(DataTreinoModel data) {
		datatreinoDao.save(data);
		
		return "DataTreino/ok";
	}
}