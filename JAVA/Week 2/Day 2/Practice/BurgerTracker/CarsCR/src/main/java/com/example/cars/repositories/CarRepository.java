package com.example.cars.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cars.models.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
	List<Car> findAll();

}
