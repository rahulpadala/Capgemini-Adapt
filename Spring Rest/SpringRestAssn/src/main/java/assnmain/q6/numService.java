package assnmain.q6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class numService {
	
	private int a;
	private int b;
	private List<Integer> l = new ArrayList<>();

	public void insertNums(numbers nums) {
		a = nums.getNum1();
		b = nums.getNum2();
	}

	public int addNums() {
		return a+b;
	}

	public int subNums() {
		
		return a-b;
	}

	public int mulNums() {
		
		return a*b;
	}

	public int divNums() {
		
		return a/b;
	}

	public List<Integer> showSqrt() {
		l.add((int) Math.sqrt(a));
		l.add((int) Math.sqrt(b));
		return l;
	}

	
	
	
}
