package assnmain.q5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmpService {

	@Autowired
	private EmpRepository Emp;
	
	public List<EmpDetails> allEmp() {
		
		List<EmpDetails> Emps = new ArrayList<>();
		Emp.findAll().forEach(Emps::add);
		return Emps;
	}

	public EmpDetails getEmp(String id) {
		
		return Emp.findById(id).orElse(null);
	}

	public void addEmp(EmpDetails ed) {
		
		Emp.save(ed);
		
	}

	public void updateEmp(String id, EmpDetails ed) {
		
		Emp.save(ed);
	}

	public void deleteEmp(String id) {
		
		Emp.deleteById(id);
	}

}
