package appexh4;

import java.util.Scanner;

import excephandling4.NumberofGroupsExceedException;
import excephandling4.Validator2;


public class appmainexh4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mode of message(photo,video,text)");
		String modemessage=sc.nextLine();
		System.out.println("Enter the no of groups");
		int noofgroups=sc.nextInt();
		sc.nextLine();
		Validator2 validator2=new Validator2();
		try
		{
		validator2.validateNumberofGroups(noofgroups);
		System.out.println("Forwarded");
		}
		catch(NumberofGroupsExceedException nex)
		{
			System.out.println("You can only share with upto 5 chats");
		}
		

	}

}
