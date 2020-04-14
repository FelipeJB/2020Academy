package org.globant.Bank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Account {
	
	public static Map<String, Double> dAccount =  new HashMap<String, Double>();
	
	public Account()
	{
		dAccount.put("abc001", (double) 2000);
		dAccount.put("abc002", (double) 3000);
		dAccount.put("abc003", (double) 4000);
		dAccount.put("abc004", (double) 5000);
	}
	
	public static void updateValues(String a, Double b)
	{
		dAccount.put(a, b);
	}
	
	public boolean validAcc(String acc)
	{
		Iterator<String> it = Account.dAccount.keySet().iterator();
		int a=0;
		while(it.hasNext())
		{
			String dat = (String) it.next();
			if(dat.contentEquals(acc)) 
			{
				a=1;
			}
				
		}
		if(a==1)return true;
		else return false;
		
	}
}
