package sample1.MVCassignment.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class assign2main {
	
	@RequestMapping(value="/q2", method = RequestMethod.GET)
	public ModelAndView test() throws IOException{
		ModelAndView m = new ModelAndView("q2a");
		return m;
	}

	@RequestMapping(value="/q2an",method = RequestMethod.POST)
	public ModelAndView test2(@RequestParam("p") int p,@RequestParam("t") int t,@RequestParam("r") int r,@ModelAttribute("aq2") assnq2 aq2) throws IOException{

		ModelAndView m = new ModelAndView("q2ans");
		int s;
		s= (p*t*r)/100;
		m.addObject("ans",""+s);
		return m;
	}

}
