package io.org.annote;

// importing javax annotation
import javax.annotation.*;

public class Employee {

	private int empId;
	private String empName;
	

	@Resource
	private VCard votercard;

	public int getEmpId() {return empId;}
	public void setEmpId(int empId) {
		this.empId = empId;}

	public String getEmpName() {
		return empName;}
	public void setEmpName(String empName) {
		this.empName = empName;}

	public VCard getVotercard() {
		return votercard;}
	public void setVotercard(VCard votercard) {
		this.votercard = votercard;}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", votercard=" + votercard + "]";
	}
	
	
}
