package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/omikuji")
public class MainController {
	
	@GetMapping("")
	public String index() {
		return "index.jsp";
	}
	@PostMapping(value = "/show")
	public String post(HttpSession session, Model model,
			 @RequestParam(value = "number") int number,
			 @RequestParam(value = "namecity") String nameCity,
			 @RequestParam(value = "realName") String realName,
			 @RequestParam(value = "hobby") String hobby,
			 @RequestParam(value = "type") String type,
			 @RequestParam(value = "something") String something) {
		session.setAttribute("number", number);
		session.setAttribute("namecity", nameCity);
		session.setAttribute("realname", realName);
		session.setAttribute("hobby", hobby);
		session.setAttribute("type", type);
		session.setAttribute("something", something);
		return "show.jsp";
	}
  
}
