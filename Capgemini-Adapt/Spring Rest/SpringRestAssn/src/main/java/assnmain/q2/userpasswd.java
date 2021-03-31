package assnmain.q2;

import org.springframework.stereotype.Service;

@Service
public class userpasswd {

	private String user;
	private String password;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public userpasswd(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	public userpasswd() {
		
	}
	
	@Override
	public String toString()
	{
		return ""+password;
	}
	
	
	
	
}
