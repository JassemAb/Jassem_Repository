package com.example.cars.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cars.models.Car;
import com.example.cars.repositories.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository carRepo;
	
	//Create
	public Car createCar(Car car) {
		return carRepo.save(car);
	}
	
	//Read One
	public Car findCarById(Long id) {
		Optional<Car> opCar = carRepo.findById(id);
		if(opCar.isPresent()) {
			return opCar.get();
		}else {
			return null;
		}
	}
	
	// Read All
	public List<Car> allCars(){
		return carRepo.findAll();
	}
	
	//Update
	public Car updateCar(Car car) {
		return carRepo.save(car);
	}
	
	//Delete
	public void deleteCar(Long id) {
		carRepo.deleteById(id);
	}
}
