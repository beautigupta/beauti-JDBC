package com.beauti.main;


import com.beauti.dao.EmployeeDaoImpl;

import java.sql.SQLException;

import com.beauti.dao.EmployeeDao;
import com.beauti.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException {

//		Persistent Object
		EmployeeDao edao = new EmployeeDaoImpl();
		Employee emp = new Employee(18, "Sunny", "Male", 67000);
		
		//edao.saveEmp(emp);
		//edao.updateEmp(emp);
		//edao.deleteEmpById(12);
		//edao.printAllEmps();
		//edao.getEmpById(4);
		edao.getEmpByName("beauti");
		System.out.println("Query executed...............");

		
	}
}
