package com.jassem.counter;
import jakarta.servlet.http.HttpSession;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpSession session) {
	
		Integer count = 0;n=
		
		if(session.getAttribute(("count") != null)) {
			session.setAttribute("count", 0);
		}else {
			count = (Integer) session.getAttribute("counter");
			count++;
			session.setAttribute("count", count);
		}
		return "index.jsp";
}
	
	@RequestMapping("/counter")
	public String counter() {
		return "counter.jsp";	
	}
}