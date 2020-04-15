import java.util.*;

public class Client {
	
	public String name;
	public int id;
	public String user;
	public String password;
	
	
	public Client create (String _name,int _id, String _user, String _password) {		
		Client newClient = new Client();
		newClient.name = _name;
		newClient.id = _id;
		newClient.user = _user;
		newClient.password = _password;
		
		return newClient;
	}
	
	public void showList (List<Client> clients) {
		
		System.out.println("Client list: ");
		System.out.format("%16s%16s%16s%16s%16s%n","Name", "ID", "User","Password");
	    clients.forEach(item->System.out.format("%16s%16d%16s%16d%n",item.name,item.id,item.user,item.password));
		
	}
	

}

//withdraw();

//addMoney();

//transferMoney(),