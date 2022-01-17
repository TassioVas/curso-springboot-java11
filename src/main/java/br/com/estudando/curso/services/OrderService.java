package br.com.estudando.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estudando.curso.entities.Order;
import br.com.estudando.curso.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository reprository;

	public List<Order> findAll(){
		return reprository.findAll();
	}
	
	public Order findById(long id) {
		Optional<Order> obj= reprository.findById(id);
		return obj.get();
		
	}
}


