package sample1.MVCassignment.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;




public class contactValidator implements ConstraintValidator<IsValidContact , String>{

	@Override
	public void initialize(IsValidContact isValidContact)
	{

	}

	@Override
	public boolean isValid(String phone, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub

		int n =phone.length();
		int c=10;
		if(n<=10)
		{
			for(int i=0;i<n;i++)
			{
				if(phone.charAt(i) >= '0'
						&& phone.charAt(i) <= '9')
				{
					c--;
				}
			}
			if(c<1)
			{
				return true;
			}
		}
		return false;
	}

}
