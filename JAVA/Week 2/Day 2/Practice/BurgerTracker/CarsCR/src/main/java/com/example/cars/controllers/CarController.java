package com.example.cars.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.cars.models.Car;
import com.example.cars.models.User;
import com.example.cars.services.CarService;
import com.example.cars.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class CarController {
	
	@Autowired
	private CarService carServ;
	
	@Autowired
	private UserService userServ;
	
	@GetMapping("/cars/new")
	public String newCar(@ModelAttribute("car") Car car,HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		if(userId==null) {
			return "redirect:/";
		}
		return "new.jsp";
	}
	
	@PostMapping("/processCar")
	public String createCar (@Valid @ModelAttribute("car") Car car, BindingResult result, HttpSession session) {
		
		Long userId = (Long) session.getAttribute("user_id");
		if(result.hasErrors()) {
			return"new.jsp";
		}else {
			User user= userServ.findUserById(userId);
			car.setOwner(user);
			Car newCar=carServ.createCar(car);
			return "redirect:/cars/show/"+newCar.getId();
		}
	}
	
	@GetMapping("/cars/show/{id}")
	public String showCar (@PathVariable ("id") Long id, Model model,HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		if(userId==null) {
			return "redirect:/";
		}
		Car car= carServ.findCarById(id);
		model.addAttribute("car", car);
		return "show.jsp";
	}
	
	@GetMapping("/cars")
	public String allCars(Model model,HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		if(userId==null) {
			return "redirect:/";
		}
		User user = userServ.findUserById(userId);
		model.addAttribute("user", user);
		List <Car> allCars = carServ.allCars();
		model.addAttribute("allCars", allCars);
		return "home.jsp";
	}
	
	// Display route for Edit form
	@GetMapping("/cars/edit/{id}")
	public String updateCar(@PathVariable("id") Long id, Model model,HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		if(userId==null) {
			return "redirect:/";
		}
		Car car = carServ.findCarById(id);
		model.addAttribute("car", car);
		return "edit.jsp";
	}
	
	//Action route for Edit
	@PutMapping("/cars/{id}")
	public String editCar(@Valid @ModelAttribute("car") Car car, BindingResult result, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			User user= userServ.findUserById(userId);
			car.setOwner(user);
			carServ.updateCar(car);
			return "redirect:/cars";
		}
	}
	
	//Delete
	@DeleteMapping("/cars/{id}")
	public String deleteCar(@PathVariable("id") Long id,HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		if(userId==null) {
			return "redirect:/";
		}
		carServ.deleteCar(id);
		return "redirect:/cars";
	}
}
