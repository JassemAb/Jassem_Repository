package com.jassem.travels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jassem.travels.models.Travel;
import com.jassem.travels.repositories.TravelRepository;

@Service
public class TravelService {
	@Autowired
	private TravelRepository TravelRepo;
	
	//create
	public Travel createTravel(Travel travel) {
		return TravelRepo.save(travel);
	}
	
	//Read one
	public Travel findTravelById(Long id) {
		Optional<Travel> opTravel = TravelRepo.findById(id);
		if(opTravel.isPresent()) {
			return opTravel.get();
		}else {
			return null;
		}
	}
	
	// Read all
	public List<Travel> allTravels(){
		return TravelRepo.findAll();
	}
	
	 public Travel updateTravels(Travel travel){
	        return TravelRepo.save(travel);
	    }
	    public void deleteTravels(Long id){
	        TravelRepo.deleteById(id);
	    }
	    
	
}
