package Departmentintr;

import beanClass.DepartmentException;
import beanClass.Employee;
import beanClass.EmployeeException;

public interface IntrDao {
	
//	 Add a new Department
//	 Register an Employee without deptId
//	 Assign a registered Employee to an existing department.
//	 Login an Employee and display his profile with a Welcome message.
//	 Get All the Department details.
//	 Update the Department location
//	 Update the existing employee password.
//	 Delete a department by did,
	
	 
	 public String addAnewDepartment(beanClass.Department dept)throws DepartmentException,EmployeeException;
	 
	 public String resisterEmployeeWithoutdeptId(Employee emp)throws DepartmentException,EmployeeException;

}
