package assnmain.q1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMsg {
	@RequestMapping("/q1")
	public String sayHi()
	{
		return "Hello";
	}

}
