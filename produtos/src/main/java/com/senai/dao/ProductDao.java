package com.senai.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.senai.model.Product;
import com.senai.repository.ProductRepository;

@Service
@Transactional
public class ProductDao {
	@Autowired
	private ProductRepository repo;

	public List<Product> listAll(){
		return repo.findAll();
	}
	
	public Product get(Long id) {
		return repo.findById(id).get();
	}
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}