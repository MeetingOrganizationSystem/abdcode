package com.virtusa.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.virtusa.entities.Rooms;

public class AdminService {
	
	List<Rooms> list = new ArrayList<Rooms>();
	Scanner sc = new Scanner(System.in);
	private String Roomname;
	private int roomno;

	public void addRoom() {
		Rooms r = new Rooms();
		System.out.println("Enter room no.");
		r.setRoomNumber(sc.nextInt());
		System.out.println("room name");
		r.setRoomName(sc.next());
        System.out.println("enter room status available/unavailable");
        r.setStatus(sc.next());
		list.add(r);
		for (Rooms r3 : list) {
			System.out.println(r3);
		}
	}

	public void updateRoom() {
		Rooms r1 = new Rooms();
		List<Rooms> list5 = new ArrayList<>();
		Iterator<Rooms> iter = list.iterator();
		while (iter.hasNext()) {
			Rooms r5=iter.next();
			System.out.println("enter room no");
			int r = sc.nextInt();

			if (r5.getRoomNumber() == r) {       
				System.out.println("enter new room number updated");
				r5.setRoomNumber(sc.nextInt());
				//int room = sc.nextInt();
				list5.add(r5);
				for (Rooms r4 : list5) {
					System.out.println(r4);
				}
				
			}
			else {
				System.out.println("invalid data");
			}
		}
	}

	public void deleteRoom() {
		Rooms r2 = new Rooms();
		Iterator<Rooms> iter = list.iterator();
		System.out.println("enter room no to be deleted");
		int r3 = sc.nextInt();
		r2 = iter.next();
		if (r2.getRoomNumber() == r3) {
			iter.remove();
			System.out.println("User Deleted Succesfully");
			for (Rooms r4 : list) {
				System.out.println(r4);
			}
		} else {
			System.out.println("Invalid Data");
		}

	}
	public void viewAllInfo() {
		for (Rooms r4 : list) {
			System.out.println(r4);
		}
		
	}

	public void approval()
	{    
		System.out.println("Approved by admin");
	}
public void login()
{
	String username="admin";
	String password="ad@123";
	System.out.println("enter admin username");
	String name=sc.next();
	System.out.println("enter password");
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
