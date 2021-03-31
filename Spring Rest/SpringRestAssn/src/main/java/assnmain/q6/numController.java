package assnmain.q6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class numController {
	
	@Autowired
	private numService ns;
	
	
	@RequestMapping(value = "/q6",method=RequestMethod.POST)
	public void insertnums(@RequestBody numbers nums)
	{
		ns.insertNums(nums);
	}
	@RequestMapping(value = "/q6/add",method=RequestMethod.GET)
	public int add()
	{
		return ns.addNums();
	}
	@RequestMapping(value = "/q6/sub",method=RequestMethod.GET)
	public int subs()
	{
		return ns.subNums();
	}
	@RequestMapping(value = "/q6/mul",method=RequestMethod.GET)
	public int mul()
	{
		return ns.mulNums();
	}
	@RequestMapping(value = "/q6/div",method=RequestMethod.GET)
	public int div()
	{
		return ns.divNums();
	}
	@RequestMapping(value = "/q6/sqrt",method=RequestMethod.GET)
	public List<Integer> Sqrt()
	{
		return ns.showSqrt();
	}

}
