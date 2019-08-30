package com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.senai.dao.ProductDao;
import com.senai.model.Product;

@Controller
@RequestMapping("/")
public class ProductController {
	@Autowired
	private ProductDao service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		return "index";
	}
	
	@RequestMapping("/NewProduct")
	public String showNewProductPage(Model model) {
		
		Product product = new Product();
		model.addAttribute("product", product);
		
		return "NewProduct";
	}
	
	@RequestMapping("/EditProduct/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id")long id) {
		ModelAndView mav = new ModelAndView("EditProduct");
		Product product = service.get(id);
		mav.addObject("product", product);
		return mav;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(Product product){
		
		service.save(product);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id")long id) {
		service.delete(id);
		return "redirect:/";
	}
	
}