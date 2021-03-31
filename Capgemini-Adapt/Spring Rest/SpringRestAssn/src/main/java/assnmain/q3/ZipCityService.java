package assnmain.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class ZipCityService {
	
	private ArrayList<ZipCity> zc = new ArrayList<>();
	
	
	public ZipCity find(String zip)
	{
		return zc.stream().filter(t -> t.getZipcode().equals(zip)).findFirst().get();
	}
	
	public ArrayList<ZipCity> addAllZcs()
	{
		return zc;
	}


	public void insert(ZipCity zcs) {
		
		zc.add(zcs);
	}

}
