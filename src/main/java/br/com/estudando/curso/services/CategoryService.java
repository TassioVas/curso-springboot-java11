package br.com.estudando.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estudando.curso.entities.Category;
import br.com.estudando.curso.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository reprository;

	public List<Category> findAll(){
		return reprository.findAll();
	}
	
	public Category findById(long id) {
		Optional<Category> obj= reprository.findById(id);
		return obj.get();
		
	}
}


