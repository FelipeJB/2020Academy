package org.globant.Bank;

public class Transactions {

	public void sendMoney(String oracc, String desacc, Double money)
	{
		double cvalue=caclTaxes(money);
		double fvalue=Account.dAccount.get(oracc)-cvalue;
		double nvalue=Account.dAccount.get(desacc)+money;
		if(!(fvalue<0))
		{
			Account.updateValues(oracc,fvalue);		
			Account.updateValues(desacc,nvalue);
		
		}else 
		{
			System.out.println("************************");
			System.out.println("FONDS not available");
		}
		
	}
	public Double caclTaxes(Double val)
	{
		System.out.println("************************");
		System.out.println("Tax for transfer $100");
		val=val+100;
		return val;
	}
	public void retrMoney(String orgac, Double mon, Integer operation)
	{
		double nvalue=Account.dAccount.get(orgac);
		double tax;
		switch(operation)
		{
		case 1:
		 if((nvalue-mon)<0)
		 {
			System.out.println("************************");
			System.out.println("No fonds available ");
		 }else
		 {
			 if(mon<=1000.0)
				{
					nvalue=nvalue-mon;
					nvalue-=200;
					Account.updateValues(orgac, nvalue);
					System.out.println("************************");
					System.out.println("Withdrawals Tax $200");
				}else if(mon > 1000.0)
				{
					nvalue=nvalue-mon;
					nvalue-=200;
					tax=(mon)*0.15;
					nvalue=nvalue-tax;
					System.out.println(nvalue);
					System.out.println("************************");
					System.out.println("Withdrawals Tax $200 + 15%");
					Account.updateValues(orgac, nvalue);
				}
		 } 
		break;
		case 2:
			nvalue=nvalue+mon;
			Account.updateValues(orgac, nvalue);
			break;
			default:break;
		}
			
	}
}
