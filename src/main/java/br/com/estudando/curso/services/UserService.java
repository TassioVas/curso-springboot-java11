package br.com.estudando.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estudando.curso.entities.User;
import br.com.estudando.curso.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository reprository;

	public List<User> findAll(){
		return reprository.findAll();
	}
	
	public User findById(long id) {
		Optional<User> obj= reprository.findById(id);
		return obj.get();
		
	}
}


