package sample1.MVCassignment.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class assnq8 {
	
	@RequestMapping(value="/login")
	public ModelAndView test1() throws IOException{
		ModelAndView m = new ModelAndView("q8a");
		return m;
	}
	@RequestMapping(value="/login2")
	public ModelAndView test2() throws IOException{
		ModelAndView m = new ModelAndView("q8b");
		return m;
	}
	@RequestMapping(value="/login3")
	public ModelAndView test3() throws IOException{
		ModelAndView m = new ModelAndView("q8c");
		return m;
	}

}
