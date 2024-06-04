package com.jassem.travels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jassem.travels.models.Travel;
import com.jassem.travels.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {
	
	@Autowired
	private TravelService travelServ;
	
	@GetMapping("/")
	private String show(@ModelAttribute("travel")Travel travel, Model model) {
		List<Travel> allTravels = travelServ.allTravels();
		model.addAttribute("allTravels", allTravels);
		return "index.jsp";
	}
	
    @PostMapping("/travel/new")
    public String create(@Valid @ModelAttribute("travels") Travel travels, BindingResult result, Model model ){
        if (result.hasErrors()) {
            List<Travel> allTravels = travelServ.allTravels();
            model.addAttribute("allTravels" , allTravels);
            return "index.jsp";
        } else {
            travelServ.createTravel(travels);
            return "redirect:/";
        }
    }
    
    @GetMapping("/travels/{id}")
    private String showOne(@PathVariable("id") Long id,@ModelAttribute("travels") Travel travels , Model model){
        Travel oneTravel = travelServ.findTravelById(id);
        model.addAttribute("travel" , oneTravel);
        return "onetravel.jsp";
    }

}
