package core.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import core.entity.Employee;

public class EmployeeService {
	
	EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("EmployeeService");
	
	EntityManager em = emf.createEntityManager();
	
	public Employee createEmployee(int id, String name, long salary) {
		Employee emp = new Employee(id);
		emp.setName(name);
		emp.setSalary(salary);
		em.persist(emp);
		return emp;
		}
	
}