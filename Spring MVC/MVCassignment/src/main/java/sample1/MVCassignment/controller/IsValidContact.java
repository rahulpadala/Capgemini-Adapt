package sample1.MVCassignment.controller;

import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy = contactValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidContact {

	String message() default "Please provide the correct phone number";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};

}

