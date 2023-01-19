package usecase;

import java.util.Scanner;

import DaoImpl.ImplDao;
import Departmentintr.IntrDao;
import beanClass.DepartmentException;
import beanClass.Employee;
import beanClass.EmployeeException;

public class ResisterEmployeeWithoutdeptId {
	
	
	public static void main(String[] args) {
		
		 //1,'Antika','chakia','antika@123','1234',20000
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter empId ");
		int empId=sc.nextInt();
		
		System.out.println("enter Ename");
		String ename=sc.next();
		System.out.println("enter Address");
		String address=sc.next();
		System.out.println("enter email ");
		String email=sc.next();
		System.out.println("enter password ");
		String password=sc.next();
		System.out.println("enter salary ");
		int salary =sc.nextInt();
		
		Employee emp=new Employee(empId, ename, address, email, password, salary, salary);
	
		IntrDao intr=new ImplDao();
		try {
			String s=intr.resisterEmployeeWithoutdeptId(emp);
			System.out.println(s);
			
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
