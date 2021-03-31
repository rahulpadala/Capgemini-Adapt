package sample1.MVCassignment.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class assnq3main {
	
	
	
	@RequestMapping(value="/q3",method = RequestMethod.GET)
	public ModelAndView test1() throws IOException{
		ModelAndView m = new ModelAndView("q3a");
		return m;
	}
	
	@RequestMapping(value="/q3an",method = RequestMethod.POST)
	public ModelAndView test1(@RequestParam("password") String pass,@RequestParam("username") String name,@ModelAttribute("ob") assnq3 ob) throws IOException{
		ModelAndView m = new ModelAndView("q3b");
		m.addObject("n","Welcome "+name);
		ModelAndView m1 = new ModelAndView("q3c");
		m1.addObject("n", "you are not "+name);
		if(pass.equals("password"))
		{
			return m;
		}
		return m1;
	}


}
