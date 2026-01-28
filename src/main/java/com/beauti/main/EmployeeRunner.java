package com.beauti.main;

import com.beauti.dao.EmployeeDaoImpl;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.beauti.dao.EmployeeDao;
import com.beauti.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException {
    
//		Persistent Object
		//EmployeeDao edao = new EmployeeDaoImpl();
		//Employee emp = new Employee(18, "Sunny", "Male", 67000);
		
		Employee ravi = new Employee(11,"sukoon","Mela",7000);
		
		//way-3
		
		Properties ps = new  Properties();
		ps.put("user", "root");
		ps.put("password","851204");
		//Connection connection = new Driver().connect("jdbc:mysql://localhost:3306/mydb","beauti","851204");
		//Statement statement = connection.createStatement();
		//statement.executeUpdate("insert into employee(id,name,gender,salary) values(8,'Ravi','male',6700)");
		
		
		//edao.saveEmp(emp);
		//edao.updateEmp(emp);
		//edao.deleteEmpById(12);
		//edao.printAllEmps();
		//edao.getEmpById(4);
		//edao.getEmpByName("beauti");
		//edao.getEmpById(5);
		System.out.println("insert into employee(id,name,gender,salary) values( "+ ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");

		System.out.println("Query executed...............");

		
	}
}
