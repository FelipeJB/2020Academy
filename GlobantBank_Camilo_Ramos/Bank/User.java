package org.globant.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
		
	public List<String> data = new ArrayList<String>();

	public User()
	{
	   data.add("user1");data.add("pass1");data.add("abc001");
	   data.add("user2");data.add("pass2");data.add("abc002");
	   data.add("user3");data.add("pass3");data.add("abc003");
	   data.add("user4");data.add("pass4");data.add("abc004");
	}
	
	
	public void users()
	{
		for(int i=0;i<data.size();i=i+3)
		{
			System.out.println(data.get(i));
		}
	}
	
	public int verUser()
	{
		Scanner scan= new Scanner(System.in);
		String key,pass;
		int desc=0;
		int d1=0,d2=0;
		while(desc==0)
		{
			System.out.println("************************");
			System.out.println("Add user");
			key=scan.nextLine();
			if(data.contains(key))
			{
				d1=data.indexOf(key);
				System.out.println("Add pass");
				pass=scan.nextLine();
				if(data.contains(pass))
				{
					d2=data.indexOf(pass);
					if(d1==(d2-1))desc=1;
					else System.out.println("Wrong Pass");	
					
				}else System.out.println("Wrong Pass");		
			}else
				System.out.println("Wrong User");
		}
		return d1;
	}
	
	public void usrData(int u)
	{
		String a=data.get(u);
		String b=data.get(u+2);
		if(data.contains(a))
		{
			for(int i=0;i<data.size();i++)
			{
				if(data.get(i).contentEquals(a))
				{
					System.out.println("************************");
					System.out.println("Hello: "+ data.get(u) +"| Account value: "+ Account.dAccount.get(b));
				}
				
			}
		}
	}
}
