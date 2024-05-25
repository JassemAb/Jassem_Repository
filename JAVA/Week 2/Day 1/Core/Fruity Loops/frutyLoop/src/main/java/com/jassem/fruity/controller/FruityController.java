package com.jassem.fruity.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jassem.fruity.model.Item;

@Controller
public class FruityController {
	
	
	@GetMapping("/")
	public String indedx(Model model) {
		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add(new Item("kiwi", 1.5));
		fruits.add(new Item("Mango", 2.0));
		fruits.add(new Item("Goji Berries", 4.0));
		fruits.add(new Item("Guava", .75));
		model.addAttribute("fruits" , fruits);
		return "index.jsp";
	}
	
	
}
