package sample1.MVCassignment.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	

	@RequestMapping(value="/q1"  )
	public ModelAndView test(HttpServletResponse response) throws IOException{
		ModelAndView m = new ModelAndView("hyperq1");
		return m;
	}
	@RequestMapping(value="/suc")
	public ModelAndView test1(HttpServletResponse response) throws IOException{
		ModelAndView m = new ModelAndView("home");
		return m;
	}
}
