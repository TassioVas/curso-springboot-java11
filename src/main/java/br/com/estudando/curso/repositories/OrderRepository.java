package br.com.estudando.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudando.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
