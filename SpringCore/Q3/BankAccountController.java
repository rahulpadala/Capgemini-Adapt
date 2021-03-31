package io.org.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankAccountController {
	
	@Autowired
	private BankAccountServiceImpl bankAccountServiceImpl;
	
	
	BankAccount b1 = new BankAccount();
	
	@ResponseBody
	public double withdraw(long accountId, double balance) {
		
		bankAccountServiceImpl.withdraw(accountId, balance);
		return accountId;
	}
	@ResponseBody
	public double deposit(long accountId, double balance) {
		
		bankAccountServiceImpl.deposit(accountId, balance);
		return accountId;
	}
	@ResponseBody
	public double getBalance(long accountId) {
		
		bankAccountServiceImpl.getBalance(accountId);
		return accountId;
	}
	@ResponseBody
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		
	
		bankAccountServiceImpl.fundTransfer(fromAccount, toAccount, amont);
		return false;
	}

}
