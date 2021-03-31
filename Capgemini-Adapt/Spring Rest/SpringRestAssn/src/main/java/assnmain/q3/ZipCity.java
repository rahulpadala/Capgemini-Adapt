package assnmain.q3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class ZipCity {
	
	private String city;
	private String state;
	private String Country;
	
	
	private String zipcode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public ZipCity(String city, String state, String country, String zipcode) {
		super();
		this.city = city;
		this.state = state;
		Country = country;
		this.zipcode = zipcode;
	}
	public ZipCity() {
		
	}
	
	

}
