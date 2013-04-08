package com.pcm.dao;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pcm.entity.Department;
import com.pcm.entity.PayRoll;

public class DepartmentDAO {
	
	private EntityManager pr;
	
	
	private EntityManagerFactory factory;

    static {
        try {
        	
            DriverManager.registerDriver((Driver) Class.forName("org.hsqldb.jdbcDriver").newInstance());
        } catch (Exception e) {
            System.out.println("Crazy exception: " + e.getMessage());
            System.exit(-1);
        }
    }

    public DepartmentDAO() {
		// TODO Auto-generated constructor stub
    	pr = Persistence.createEntityManagerFactory("pu").createEntityManager();
	}
    
    public void init() {
    	pr = factory.createEntityManager();
    }
	
	public void persist(Department p) {
		pr.getTransaction().begin();
		try {
			pr.persist(p);
			pr.flush();
			pr.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception occured - rolling back");
			pr.getTransaction().rollback();
		}
	}

	public List<Department> findDeptName(String deptname) {
		// TODO Auto-generated method stub
		return pr.createQuery("SELECT e FROM Department e WHERE Department_Name = :name",Department.class)
                .setParameter("name",deptname)
                .getResultList();
	}	
	
	public void setFactory(EntityManagerFactory factory) {
		this.factory = factory;
	}

}
