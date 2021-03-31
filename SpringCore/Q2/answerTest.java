package io.org.listProg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class answerTest {

	public static void main(String[] args) {
	
		ApplicationContext fac = new ClassPathXmlApplicationContext("answers.xml");
		Question q = (Question)fac.getBean("questions");
		
		System.out.println(q.toString());
	}

}
