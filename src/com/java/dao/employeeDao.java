package com.java.dao;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java.Connect.DataConnect;
import com.java.model.Employee;
public class employeeDao {
 Connection con;
 PreparedStatement stat;
 ResultSet rs;
 Scanner sc=new Scanner(System.in);
  public employeeDao()
  {
	  con=DataConnect.getConnection();
	  
  }
  public void insertEmp(Employee e)
  {
	  try
	  {
	   stat=con.prepareStatement("insert into staffs values(?,?,?,?,?)");
	   stat.setInt(1,e.getId() );
	   stat.setString(2,e.getName());
	   stat.setString(3,e.getDept());
	   stat.setInt(4,e.getSalary());
	   stat.setString(5,e.getCity());
	   stat.executeUpdate();
	   System.out.println("record inserted successfully");
	  }
	  catch(Exception n)
	  {
		  System.out.print(n.getMessage());		  
	  }
  }
  public void deleteEmp(String nm)
  {
	  try
	  {
		  stat=con.prepareStatement("select name from staffs");
          rs=stat.executeQuery();
		  boolean flag=false;
		  while(rs.next())
		  {
			 if(rs.getString(1).equals(nm)) 
			 {
				 flag=true;
			 }
			 stat=con.prepareStatement("delete from staffs where name=?");
			 stat.setString(1,nm);
			 stat.executeUpdate();
			 System.out.println("Record removed successfully");
		  } 
		 if(flag==false)
		 {
			 System.out.println("Record not found");			
		  }
	  }
       catch(Exception m)
       {
    	   System.out.println(m.getMessage());
       }
	}
  public void updateEmpsalary(String nm)
  {
	  try
	  {
		  stat=con.prepareStatement("select name from staffs");
          rs=stat.executeQuery();
		  boolean flag=false;
		  while(rs.next())
		  {
			 if(rs.getString(1).equals(nm)) 
			 {
				 flag=true;
			 	 System.out.println("Enter the increment u want to add to that person"); 
			 	 int s=sc.nextInt();
			 	 stat=con.prepareStatement("update staffs set salary=salary+? where name=?");
			 	 stat.setInt(1,s);
			 	 stat.setString(2,nm);
	             stat.executeUpdate(); 
	             System.out.println("salary updated successfully");
              }
		  }
		   if(flag==false)
		   {
				 System.out.println("Record not found");			
		   }
	  }
	  catch(Exception m)
       {
   	     System.out.println(m.getMessage());
       }

  }public void showEmployee(String nm)
	  {
		  try
		  {
			  stat=con.prepareStatement("select name from staffs");
	          rs=stat.executeQuery();
			  boolean flag=false;
			  while(rs.next())
			  {
				 if(rs.getString(1).equals(nm)) 
				 {
					 flag=true;
					 System.out.println("Enter the name u want to add to show"); 
				 	 int s=sc.nextInt();
				 	 stat=con.prepareStatement("select*from staffs where name=?");
				 	 stat.setInt(1,s);
				 	 stat.setString(2,nm);
		             stat.executeUpdate(); 
		             System.out.println(" show successfully");
	              }
			  }
			   if(flag==false)
			   {
					 System.out.println("Record not found");			
			   }
		  }
		  catch(Exception m)
	         {
	   	   System.out.println(m.getMessage());
	       }	
	  }
   public void showDetails()
   {
	   try
	   {
		   stat=con.prepareStatement("select*from staffs");
		   rs=stat.executeQuery();
		   while(rs.next())
		   {
			   System.out.println("id:"+rs.getInt(1));
			   System.out.println("name:"+rs.getString(2));
			   System.out.println("dept:"+rs.getString(3));
			   System.out.println("salary:"+rs.getInt(4));
			   System.out.println("city:"+rs.getString(5));
			   System.out.println(" ");
		   }
	   }
	      catch(Exception e)
	   
	         {
	    	  System.out.println(e.getMessage());
	    	  
	       }
   }
	   public void showParticularemp(String nm)
	   {
		   try
			  {
				  stat=con.prepareStatement("select name from staffs");
		          rs=stat.executeQuery();
				  boolean flag=false;
				  while(rs.next())
				  {
					 if(rs.getString(1).equals(nm)) 
					 {
						 flag=true;
						 stat=con.prepareStatement("select id,name,dept,salary,city from emp33 where name=?");
						 stat.setString(1,nm);
						 ResultSet rs1=stat.executeQuery();
						 while(rs1.next())
						 {

							   System.out.println("id:"+rs1.getInt(1));
							   System.out.println("name:"+rs1.getString(2));
							   System.out.println("dept:"+rs1.getString(3));
							   System.out.println("salary:"+rs1.getInt(4));
							   System.out.println("city:"+rs1.getString(5));
						  
						 }
					   }
					 }
						 if(flag==false)
						 {
								 System.out.println("Record not found");			
						 }
				 }
		         catch(Exception e)
		         {
		      	    System.out.println(e.getMessage());
		       	 }     
		   
	    }
			   
	   public void updateEmpjobrole(String nm)
	   {
		     try
			  {
				  stat=con.prepareStatement("select name from staffs");
		          rs=stat.executeQuery();
				  boolean flag=false;
				  while(rs.next())
				  {
					 if(rs.getString(1).equals(nm)) 
					 {
						 flag=true;
						 System.out.println("promotes to");
						 String nm1=sc.nextLine();
						 stat=con.prepareStatement("update staffs set dept=? where name=?");
					 	 stat.setString(1,nm1);
					 	 stat.setString(2,nm);
			             stat.executeUpdate(); 
			             System.out.println("promoted successfully");
		              }
	               }
			   
		       if(flag==false)
		      {
				 System.out.println("Record not found");			
		      }
	      }
	      catch(Exception m)
          {
   	           System.out.println(m.getMessage());
          }	
      }
}
		

