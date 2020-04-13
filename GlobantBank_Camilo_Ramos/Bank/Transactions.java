package org.globant.Bank;

public class Transactions {

	public void sendMoney(String oracc, String desacc, Double money)
	{

		User user = new User();
		double cvalue=caclTaxes(money);
		double fvalue=Account.dAccount.get(oracc)-cvalue;
		double nvalue=Account.dAccount.get(desacc)+money;
		if(!(fvalue<0))
		{
			Account.updateValues(oracc,fvalue);		
			Account.updateValues(desacc,nvalue);
	
			if(user.data.contains(desacc))
			{
				for(int i=0;i<user.data.size();i++)
				{
					if(user.data.get(i).contentEquals(desacc))
					{
						System.out.println("User: "+ user.data.get(i-2)+"| Pass: " + user.data.get(i-1)+"| Account value: "+ Account.dAccount.get(desacc));
					}
					
				}
		     }
			if(user.data.contains(oracc))
			{
				for(int i=0;i<user.data.size();i++)
				{
					if(user.data.get(i).contentEquals(oracc))
					{
						System.out.println("User: "+ user.data.get(i-2)+"| Pass: " + user.data.get(i-1)+"| Account value: "+ Account.dAccount.get(oracc));
					}
					
				}
		     }
			
		}else 
		System.out.println("************************");
		System.out.println("Fonds not available");
	}
	public Double caclTaxes(Double val)
	{
		double tax;
		if(val<1000.0)
		{
			val+=300.0;
			return val;
		}else if(val > 1000.0)
		{
			tax=(val+300.0)+((val+300)*0.15);
			return tax;
		}else
			return val;
		
	}
	public void retrMoney(String orgac, Double mon, Integer operation)
	{
		double nvalue=Account.dAccount.get(orgac);
		switch(operation)
		{
		case 1:
		 if((nvalue-mon)<0)
		 {
			System.out.println("************************");
			System.out.println("No fonds available ");
		 }else
		 nvalue=nvalue-mon;
		 Account.updateValues(orgac, nvalue);
		break;
		case 2:
			nvalue=nvalue+mon;
			Account.updateValues(orgac, nvalue);
			break;
			default:break;
		}
			
	}
}
