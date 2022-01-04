package br.com.estudando.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudando.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
