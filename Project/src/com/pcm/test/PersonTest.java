package com.pcm.test;

import java.util.Set;

import junit.framework.Assert;

import org.junit.Test;

import com.pcm.entity.Person;
import com.pcm.entity.President;
import com.pcm.exceptions.PresidentException;

public class PersonTest {
	
	public final String FIRST_NAME = "Ezekiel";
	public final String LAST_NAME = "Calayag";
	public final int AGE = 22;
	public final String SALARY = "500000";

	@Test
	public void basicPersonCreationTests() throws PresidentException {

		
		President p1 = new President(FIRST_NAME, LAST_NAME, AGE, SALARY);
		p1.fire();
	
	}

}
