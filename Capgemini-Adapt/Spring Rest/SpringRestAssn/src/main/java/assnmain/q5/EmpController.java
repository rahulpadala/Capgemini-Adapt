package assnmain.q5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmpController {
	
	@Autowired
	private EmpService es;


	@RequestMapping("/q5")
	public List<EmpDetails> getAllEmp() {
		return es.allEmp();
	}
	
	@RequestMapping("/q5/{id}")
	public EmpDetails getTopic(@PathVariable String id)
	{
		return es.getEmp(id);
	}
	
	@RequestMapping(value="/q5",method=RequestMethod.POST)
	public void addTopic(@RequestBody EmpDetails ed)
	{
		es.addEmp(ed);
	}
	
	@RequestMapping(value="/q5/{id}",method=RequestMethod.PUT)
	public void updateTopic(@RequestBody EmpDetails ed,@PathVariable String id)
	{
		es.updateEmp(id,ed);
	}
	
	@RequestMapping(value="/q5/{id}",method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id)
	{
		es.deleteEmp(id);
	}

}
