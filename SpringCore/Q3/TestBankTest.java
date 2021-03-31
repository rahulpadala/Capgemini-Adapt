package io.org.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestBankTest {

	@Test
	void test() {

		AbstractApplicationContext fac =  new ClassPathXmlApplicationContext("spring.xml");
		
		
		BankAccount b = (BankAccount)fac.getBean("bankAccount");
		
		
		assertEquals(true,fac.containsBean("bankAccount"),"this should be true..");
	}

}
