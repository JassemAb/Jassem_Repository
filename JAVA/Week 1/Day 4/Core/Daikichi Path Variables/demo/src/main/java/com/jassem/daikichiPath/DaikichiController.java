package com.jassem.daikichiPath;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping("/daikichi/travel/{placeId}")
	public String showPlace(@PathVariable("placeId") String placeId) {
		return "Congratulation! You will soon travel to " + "  " + placeId;
	}
	
	@RequestMapping("daikichi/lotto/{num}")
	public String odd(@PathVariable("num") int num) {
		if(num % 2==0 ) {
			return "You will take a grand journey in the near future, but be wary of tempting offers";
	}else {
		return "You have enjoyed the fruits of your labor but now is a great time with family and friends.";
	}
	
	
}
}