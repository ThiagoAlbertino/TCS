package br.com.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.academia.daos.UsuarioDAO;
import br.com.academia.models.UsuarioModel;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioDAO usuarioDao;
	
	@RequestMapping("/Usuario/form")
	public String form() {
		System.out.println("Gravando usuario");
		return "Usuario/form";
	}
	@RequestMapping("/Usuario")
	public String save(UsuarioModel usuario) {
		usuarioDao.save(usuario);
		
		return "Usuario/ok";
	}
}