package com.jatin.demo;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
	
	@RequestMapping("home")
	public ModelAndView homeRequest(@RequestParam("name") String userName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",userName);
		mv.setViewName("home");
		return mv; 
	}
	
	@RequestMapping("profile")
	public ModelAndView profilePageRequest(Alien alien) {
		ModelAndView mv = new ModelAndView(); 
		mv.addObject("alien",alien);
		mv.setViewName("profile");
		return mv; 
	}
	
//	@RequestMapping("home")
//	public String homeRequest(@RequestParam("name") String userName,HttpSession session) {
//		session.setAttribute("name", userName);
//		System.out.println("A request to /home is made by " + userName);
//		return "home";
//	}
	
//	@RequestMapping("home")
//	public String homeRequest(HttpServletRequest req) {
//		HttpSession session = req.getSession(); 
//		String name = req.getParameter("name"); 
//		session.setAttribute("name", name);
//		System.out.println("A request to /home is made by " + name);
//		return "home";
//	}
	
		
}
