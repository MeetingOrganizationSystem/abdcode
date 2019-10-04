package com.virtusa.service;

import java.util.Scanner;

import com.virtusa.entities.Rooms;

public class OrganizerService {
	
	boolean b1;
	Scanner sc=new Scanner(System.in);
	AdminService as=new AdminService();
	Rooms rb=new Rooms();
    public void search()
	{
		System.out.println("enter available room no to be booked");
		int r=sc.nextInt();
	String s1="available";
		if(s1.equals("available"))
		{
			System.out.println("Room is available\n Room booked");
			
			b1=true;
			as.approval();
			System.out.println("enter meeting date");
			String date=sc.next();
			System.out.println("enter meeting start time");
			int st=sc.nextInt();
			System.out.println("enter meeting end time");
			int et=sc.nextInt();
			System.out.println("meeting date:"+date+"  meeting start time:"+st+"  meeting end time:"+et);
			System.out.println("Conduct the meeting\nmeeting conducted succcessfully");
			System.exit(0);
		}
		else
		{
			b1=false;
			System.out.println("cancel or reschedule the meeting");
		}
	}
	
	public void org()	
	
	{
		System.out.println("Welcome Meeting Organizer");
		search();
	}
	public void login()
	{
		String username="meeting";
		String password="meeting@123";
		System.out.println("enter username for meeting organizer");
		String name=sc.next();
		System.out.println("enter password for meeting organizer");
		String pwd=sc.next();
		if(username.equals(name)&& password.equals(pwd))
		{
			System.out.println("Logged in successfully");
		}
		else
		{
			System.out.println("invalid details");
			System.exit(0);
		}
	}

}
