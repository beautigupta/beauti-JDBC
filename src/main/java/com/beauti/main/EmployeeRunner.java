package com.beauti.main;



import java.sql.SQLException;

import com.beauti.dao.EmployeeDao;
import com.beauti.dao.EmployeeDaoImpl;
import com.beauti.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException  {
		
		EmployeeDao edao = new EmployeeDaoImpl();

		Employee emp = new Employee(13, "Kushal Mangal", "Male", 67000);
		

//		edao.saveEmpByPS(emp);
		edao.updateEmp(emp);
		
		edao.printAllEmps();
		
		System.out.println("Query executed...............");

	}

}
