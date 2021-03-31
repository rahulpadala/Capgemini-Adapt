package assnmain.q5;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


@Entity 
public class EmpDetails {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String empId;

	private String empName;
	private String empDep; 
	private String empDes;
	private String empSalary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	public String getEmpDes() {
		return empDes;
	}
	public void setEmpDes(String empDes) {
		this.empDes = empDes;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpId() {
		return empId;
	}
	public EmpDetails(String empName, String empDep, String empDes, String empSalary) {
		super();
		this.empName = empName;
		this.empDep = empDep;
		this.empDes = empDes;
		this.empSalary = empSalary;
	}
	public EmpDetails() {

	}


}
