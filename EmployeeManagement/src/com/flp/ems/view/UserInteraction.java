package com.flp.ems.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
 
public class UserInteraction {
	String FName;
	String MName;
	String LName;
	int EmployeeId;
	int KinId;
	String Email;
	String Phone;
	String DateOfJoining;
	String DateOfBirth;
	int RoleId;
	int DepartmentId;
	int ProjectId;
	 
	 Scanner sc2 = new Scanner(System.in);
	 Map<String,Object> mp= new HashMap<String,Object>();
	 
	 public void AddEmployee()
	 {
		 
		 
		 System.out.println ("Enter the First Name");
		 mp.put("First Name:",sc2.next());
		 
		 System.out.println ("Enter the Middle Name");
		 mp.put("Middle Name:",sc2.next());
		 
		 System.out.println ("Enter the Last Name");
		 mp.put("Last Name:",sc2.next());
		 
		 System.out.println ("Enter the KinId");
		 mp.put("Kin Id",sc2.nextInt());
		 
		 System.out.println ("Enter the Email");
		 mp.put("E mail:",sc2.next());
		 
		 System.out.println ("Enter the Phone No.");
		 mp.put("Phone No.:",sc2.next());
		 
		 System.out.println ("Enter the Date of joining");
		 mp.put("Date Of Joining:",sc2.next());
		 
		 System.out.println ("Enter the Date Of Birth");
		 mp.put("Date OfBirth",sc2.next());
		 
		 System.out.println("Enter the Role");
		 mp.put("Role ID:",sc2.nextInt());
		 
		 System.out.println("Enter the Department Id");
		 mp.put("Department:",sc2.nextInt());
		 
		 System.out.println("Enter the Project Id");
		 mp.put("Project Id :",sc2.nextInt());
	
		 System.out.println(mp);
	
		}

	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	public void SearchEmployee() {
		
		
	}

}
