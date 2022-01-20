package br.com.estudando.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudando.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
