package com.beauti.main;



import java.sql.SQLException;

import com.beauti.dao.EmployeeDao;
import com.beauti.dao.EmployeeDaoImpl;
import com.beauti.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException  {
		
		EmployeeDao edao = new EmployeeDaoImpl();

//		Employee emp = new Employee(4, "Sunny", "female", 67000);
		

//		edao.printAllEmps();
		
//		System.out.println(edao.getEmpById(3));
//		System.out.println(edao.getEmpByName("Sunny"));
		
		edao.printEmpByName("Sunny' or '1=1");
		System.out.println("Query executed...............");

	}

}

