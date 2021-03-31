package assnmain.q2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class userService {
	
	private List<userpasswd> up = new ArrayList<>();
	
	public void userPasswordEntry(userpasswd ups)
	{
		up.add(ups);
	}
	
	public String userPasswordCheck()
	{

		String s1 = ""+up.get(0);
		if(s1.equals("password"))
		{
			return "valid user";
		}
		return "Invalid user";
		
	}

}
