package sample1.MVCassignment.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class assnq6main {


	@RequestMapping(value="/q6",method = RequestMethod.GET)
	public ModelAndView test() throws IOException{
		ModelAndView m = new ModelAndView("q6a");
		return m;
	}



	@RequestMapping(value="/q6an",method = RequestMethod.POST)
	public ModelAndView test1(@Valid @ModelAttribute("ob") assnq6 ob,BindingResult result) throws IOException{

		if(result.hasErrors())
		{
			ModelAndView m = new ModelAndView("q6a");
			return m;
		}
		ModelAndView m = new ModelAndView("q6b");
		return m;

	}



}
