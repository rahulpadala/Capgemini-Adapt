package assnmain.q3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ZipCityController {
	
	@Autowired
	private ZipCityService zcs;
	
	
	@RequestMapping(value="/q3",method = RequestMethod.POST)
	public void Insert(@RequestBody ZipCity zc) {
		zcs.insert(zc);
	}
	
	@RequestMapping(value="/q3",method = RequestMethod.GET)
	public ArrayList<ZipCity> getAll() {
		return zcs.addAllZcs();
	}
	
	@RequestMapping("/q3/{zip}")
	public ZipCity findZcs(@PathVariable String zip) {
		return zcs.find(zip);
	}

}
