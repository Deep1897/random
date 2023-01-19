package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.Database;
import Departmentintr.IntrDao;
import beanClass.Department;
import beanClass.DepartmentException;
import beanClass.Employee;
import beanClass.EmployeeException;

public class ImplDao implements IntrDao{

	@Override
	public String addAnewDepartment(Department dept) throws DepartmentException, EmployeeException {
		String s="not added";
		
		try (Connection conn= Database.provideConnection()){
			 PreparedStatement pr= conn.prepareStatement("insert into Department values(?,?,?)");
			pr.setInt(1, dept.getDid());
			pr.setString(2, dept.getDname());
			pr.setString(3, dept.getLocation());
		int x=	pr.executeUpdate();
			if(x>0)
			{
				s="added successfully...";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return s;
	}

	@Override
	public String resisterEmployeeWithoutdeptId(Employee emp) throws DepartmentException, EmployeeException {
		String s="resistration fail..";
		
		try (Connection conn= Database.provideConnection()){                 //1,'Antika','chakia','antika@123','1234',20000
			
			PreparedStatement pr= conn.prepareStatement("insert into Employee(empId,ename,address,email,password,salary)"+"values(?,?,?,?,?,?)");
			 pr.setInt(1, emp.getEmpId());
			 pr.setString(2, emp.getEname());
			 pr.setString(3, emp.getAddress());
			 pr.setString(4, emp.getEmail());
			 pr.setString(5, emp.getPassword());
			 pr.setInt(6, emp.getSalary());
			 
			 int x= pr.executeUpdate();
			 if(x>0) {
				 s="resistration successfull....";
			 }
			 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		return s;
		
		
	}

	

}
