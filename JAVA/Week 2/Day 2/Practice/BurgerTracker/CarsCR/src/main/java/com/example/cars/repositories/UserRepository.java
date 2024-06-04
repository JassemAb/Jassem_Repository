package com.example.cars.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.cars.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User>findByEmail(String email);
}
