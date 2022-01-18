package br.com.estudando.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estudando.curso.entities.Product;
import br.com.estudando.curso.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository reprository;

	public List<Product> findAll(){
		return reprository.findAll();
	}
	
	public Product findById(long id) {
		Optional<Product> obj= reprository.findById(id);
		return obj.get();
		
	}
}

