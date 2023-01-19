package usecase;

import java.util.Scanner;

import DaoImpl.ImplDao;
import Departmentintr.IntrDao;
import beanClass.Department;
import beanClass.DepartmentException;
import beanClass.EmployeeException;

public class AddAnewDepartment {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter did");
		
		int did=sc.nextInt();
		
		System.out.println("Enter dname");
		String dname=sc.next();
		
		System.out.println("Enter location");
		String location =sc.next();
		Department dr=new Department(did, dname, location);
		IntrDao intr=new ImplDao();
		try {
			String s=intr.addAnewDepartment(dr);
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
