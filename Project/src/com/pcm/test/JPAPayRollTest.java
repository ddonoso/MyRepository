package com.pcm.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pcm.entity.Employee;
import com.pcm.entity.President;
import com.pcm.exceptions.PresidentException;
import com.pcm.service.PayroleService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/beans.xml"})
public class JPAPayRollTest {

	
	@Autowired
	private PayroleService ps;
	
	@Test
	public void payRollTest() throws PresidentException{
		
		President e = new President("Ezekiel","Calayag",22,"50000");
		e.getPayroll().setYearsOfService(10);
		// 10000 * 1.1 * 1.1 * 12 * 0.25
		assertEquals(ps.getPension(e), "353692.22");	
				
	}
	
	@Test
	public void goldenParachute() throws PresidentException{
		
		President pres = new President("Kellogs", "Calayag", 22, "500");
		pres.getPayroll().setYearsOfService(10);
		ps.getPension(pres);
		assertEquals(pres.getGoldenParachuteBonus(), "10000");
		
		
		Employee emp = new Employee("Kiel", "Calayag", 22, "5500");
		emp.getPayroll().setYearsOfService(10);
		assertEquals(ps.getPension(emp), "38906.14");
		assertEquals(emp.getGoldenParachuteBonus(), null);
	}

	
}


