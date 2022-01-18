package br.com.estudando.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudando.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
