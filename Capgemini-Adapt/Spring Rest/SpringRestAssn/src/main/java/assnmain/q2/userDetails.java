package assnmain.q2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userDetails {
	
	@Autowired 
	private userService us;
	
	@RequestMapping(value="/q2",method=RequestMethod.POST)
	public void userPasswordEntry(@RequestBody userpasswd up) {
		us.userPasswordEntry(up);
	}
	@RequestMapping(value="/q2",method=RequestMethod.GET)
	public String userPasswordCheck() {
		return us.userPasswordCheck();
	}

}
