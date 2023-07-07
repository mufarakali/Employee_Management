package com.java.Service;

import java.util.Scanner;

import com.java.dao.employeeDao;
import com.java.model.Employee;

public class EmployeeService {
   Scanner sc,sc1;
   public employeeDao edao;
   public EmployeeService()
   {
	   sc=new Scanner(System.in);
	   sc1=new Scanner(System.in);
	   edao=new employeeDao();
   }
    public void addEmployee()
    {
    	System.out.println("Enter the employee id");
    	int id=sc.nextInt();
    	
    	System.out.println("Enter the employee name");
        String name=sc1.nextLine();
         
        System.out.println("Enter the employee department");    
    	String dept=sc1.nextLine();
    	
    	System.out.println("Enter the employee salary");
    	int salary=sc.nextInt();
    	
    	System.out.println("Enter the employee city"); 	
    	String city=sc1.nextLine();
    	
    	//Employee e=new Employee(id,name,dept,salary,city);
    	Employee e=new Employee();
    	e.setId(id);
    	e.setName(name);
    	e.setDept(dept);
    	e.setSalary(salary);
    	e.setCity(city);
    	
    	edao.insertEmp(e);
    	
    }
    
     public void delEmployee()
     {
    	 System.out.println("enter the staff name you want to delete");
    	 String nm=sc.nextLine();
    	 edao.deleteEmp(nm);
       	 
     }
     public void updateEmployeesalary()
     {
    	 System.out.println("enter the staff name whose salary you want to change");
    	 String nm=sc.nextLine();
    	 edao.updateEmpsalary(nm);
     }	 
    	 
    	public void showAllEmployees()
    	{
    		edao.showDetails();
    	}
    	public void toshowParticularemployee()
    	{
    		System.out.println("enter the staff you want to see");
    		String nm=sc.nextLine();
    		edao.showParticularemp(nm);
    	}
        public void jobPromotion() 
        {
          System.out.println("enter the staff name you want to promote");
       	 String nm=sc.nextLine();
       	 edao.updateEmpjobrole(nm);       	
        	
        }
}
     

