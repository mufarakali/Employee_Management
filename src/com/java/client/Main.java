package com.java.client;

import java.util.Scanner;

import com.java.Service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EmployeeService obj=new EmployeeService();
    Scanner sc=new Scanner(System.in);
    while(true)
    {
	    System.out.println("choice 1-->to add a new staff \n");
	    System.out.println("choice 2-->to show all the staffs");
	    System.out.println("choice 3--->to show only the particular staff\n");
	    System.out.println("choice 4--->to delete a staff record" );
	    System.out.println("choice 5--->to increase the salary of staff\n");
	    System.out.println("choice 6--->for job promotion");
	    System.out.println("Enter your choice\n");
	    int choice=sc.nextInt();
	    if(choice==1)
	    {
	      obj.addEmployee();
		}
	    else if(choice==2)
	    {
	      obj.showAllEmployees();    	
	    }
	    else if(choice==3)
	    {
	    	obj.toshowParticularemployee();
	    	
	    }
	    else if(choice==4)
	    {
	    	obj.delEmployee();    	
	    }
	    else if(choice==5)
	    {
	         obj.updateEmployeesalary();	
	    }
	    else if(choice==6)
	    {
	    	obj.jobPromotion();
	    }
	    else
	    {
	       System.out.println("Invalid choice");
	    }
	  }
	    
    }
	}
	
	    
	    

