import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Tech_Lead tl = new Tech_Lead();
		Senior_Engineer se = new Senior_Engineer();
		Junior_Engineer je = new Junior_Engineer();
		int opc = 0;
		
		while(opc != 4) {
			System.out.println("----------------------------------------" );
			System.out.println("           Welcome" );
			System.out.println("----------------------------------------" );
			System.out.println("Please choose one option: "
					+ "\n1.Do you want see the information related with the Junior engineer?"
					+ "\n2.Do you want see the information related with the Senior engineer?"
					+ "\n3.Do you want see the information related with the Tech Lead?"
					+ "\n4.Exit the program");
			opc = read.nextInt();
			
			switch(opc) {
				case 1:
					System.out.println("----------------------------------------" );
					System.out.println("The Junior engineer have the following responsibilities: \n" );
					je.meetings();
					System.out.println("\n" );
					je.documentation();
					System.out.println("\n" );
					je.clean();
					System.out.println("\n" );
					je.respect();
					System.out.println("\n" );
					System.out.println("Salary: " + je.calculateSalary() );
					break;
				
				case 2:
					System.out.println("----------------------------------------" );
					System.out.println("The Senior engineer have the following responsibilities: \n" );
					se.meetings();
					System.out.println("\n" );
					se.documentation();
					System.out.println("\n" );
					se.clean();
					System.out.println("\n" );
					se.respect();
					System.out.println("\n" );
					System.out.println("Salary: " + se.calculateSalary() );
					break;
				case 3:
					System.out.println("----------------------------------------" );
					System.out.println("The Tech lead have the following responsibilities: \n" );
					tl.meetings();
					System.out.println("\n" );
					tl.documentation();
					System.out.println("\n" );
					tl.clean();
					System.out.println("\n" );
					tl.respect();
					System.out.println("\n" );
					System.out.println("Salary: " + tl.calculateSalary() );
					break;
			}
		}
	}

}
