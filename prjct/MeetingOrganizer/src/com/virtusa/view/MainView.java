package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.entities.Admin;
import com.virtusa.entities.Rooms;
import com.virtusa.service.AdminService;
import com.virtusa.service.OrganizerService;

public class MainView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		AdminService as=new AdminService();
		OrganizerService os=new OrganizerService();
		Rooms rb=new Rooms();
		Admin ad=new Admin();
		System.out.println();
		as.login();
		while(true)
			{
			System.out.println("Welcome Admin");
		System.out.println("1.Add room\n 2.update room\n 3.delete room\n 4.view all information\n 5.exit");	
		int choice=sc.nextInt();
		switch(choice){
		case 1: as.addRoom();
		         break;
		
		case 2: as.updateRoom();
		 break;
			
		case 3: as.deleteRoom();
		 break;
		case 4: as.viewAllInfo();
		break;
		case 5:os.login();
			System.out.println("Welcome meeting organizer\n room information");
			 as.viewAllInfo();
			 os.org();
	default:
			System.out.println("choose number from given choice");
			}
		}
		}
	
	

}
