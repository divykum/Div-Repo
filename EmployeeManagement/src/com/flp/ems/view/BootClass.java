package com.flp.ems.view;

import java.util.Scanner;

public class BootClass 
{

	public void  menuselection()
	 {
		int ch=0;
		Scanner sc = new Scanner(System.in);
		UserInteraction ui = new UserInteraction();
		System.out.println("Menu");
		System.out.println("Please Enter Your Choice");
		System.out.println("Press\n 1 -To Add Employee \n 2 -To Modify Record\n 3 -Delete record\n 4 -List Records\n 5 -Search Record ");
		ch = sc.nextInt();
		
		
		switch(ch)
		{
		case 1: ui.AddEmployee();
		break;
		case 2: ui.ModifyEmployee();
		break;
		case 3: ui.RemoveEmployee();
		break;
		case 4: ui.getAllEmployee();
		break;
		case 5: ui.SearchEmployee();
		break;
		default: System.out.println("Invalid Option Selected.\n Please try again.\nThank You");
		}
	}

	 public static void main(String args[])
	 {
		 BootClass bc=new BootClass();
		 bc.menuselection();
	}
}