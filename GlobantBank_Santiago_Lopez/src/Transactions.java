import java.util.*;

public class Transactions {
	public int idt;
	public int id_user;
	public String type;
	public double value_tax;
	public double total;
	
	public Transactions(int idt, int id_user, String type, double value_tax, double total) {
		this.idt = idt;
		this.id_user = id_user;
		this.type = type;
		this.value_tax = value_tax;
		this.total = total;
	}
}
