import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	int action;
	String user;
	String user1;
	String pass;
	String pass1;
	int acc2;
	int busqueda = 9999;
	int busqueda2 = 9999 ;
	int busqueda3 = 9999 ;
	int retirar;
	int saldoAcutual;
	int valor;
	int destino;
	int DetinoID;
	Scanner sc = new Scanner(System.in);
	ArrayList<Account> cuenta = new ArrayList<>();
	
	public void agregarCuenta() {
	
		cuenta.add(new Account("sebastian123","123",101,"12/10/2009",100000));
		cuenta.add(new Account("sebastian456","456",202,"02/11/2019",100000));
		cuenta.add(new Account("sebastian789","789",303,"01/04/2020",100000));
		cuenta.add(new Account("sebastian012","012",404,"12/11/2012",100000));
		cuenta.add(new Account("sebastian345","345",505,"12/10/2014",100000));
	}
	 
	 
	 public void mostrarCuenta() {
	    	for (int i = 0; i < cuenta.size(); i++) {
	            System.out.println("Cliente: " + cuenta.get(i).getUser() + ", clave: " + cuenta.get(i).getPass() + ", Cuenta: " + cuenta.get(i).getAccountNum() + " Saldo: " +cuenta.get(i).getBalance() +" Fecha de Apertura: "+ cuenta.get(i).getOpenDate());
	            			}
	    }
	 
	 public void  areaTransaccional (){
		 System.out.println("----------------------------------------");
	        System.out.println("Ingrese Usuario:");
	        String user = sc.nextLine();
	        System.out.println("Ingrese Pass:");
	        String pass = sc.nextLine();
			System.out.println("----------------------------------------");
	        
			
			for (int i = 0; i < cuenta.size(); i++) {
				user1 = cuenta.get(i).getUser();
				
				if (user.equals(user1)) {
				 busqueda = i;
				 pass1 = cuenta.get(i).getPass();
					
					if (pass.equals(pass1)) {
					 busqueda2 = 1;
					 System.out.println("Bienvenido");
					 menuTransaccion(busqueda);
					 
					}
				 
				}	
								 
	            			}
			
			if (busqueda == 9999 || busqueda2 == 9999) {
			System.out.println("Usuario o clave incorrecta");
			
			}
			busqueda=9999;
			busqueda2=9999;
			
	    }
			
	 public void menuTransaccion(int cuen) {
		 
		 do {
			 
			// System.out.println(cuen);
			 System.out.println("----------------------------------------");
		     System.out.println("Pulse 1 para retirar");
		     System.out.println("Pulse 2 para depositar");
		     System.out.println("Pulse 3 para transferencia");
		     System.out.println("Pulse 4 para finalizar sesion");
		     System.out.println("----------------------------------------");
			 action = sc.nextInt();
			 
			 switch(action) {
				case 1 : //retirar
					
					System.out.println("Ingrese valor a retirar");
				    System.out.println("----------------------------------------");
				    retirar = sc.nextInt();
				  
				    
				    if(validarSaldo(retirar,cuen)== true) {
				    	
				    	 if(retirar<1000) {
				    		 
				    		 valor=retirar+200;
				    		 cuenta.get(cuen).setBalance(valor);
				    		 System.out.println("Su nuevo saldo es: "+cuenta.get(cuen).getBalance());
				    	 }else {
				    		 
				    		 valor= (int) (retirar+200+(retirar*0.15));
				    		 cuenta.get(cuen).setBalance(valor);
				    		 System.out.println("Su nuevo saldo es: "+cuenta.get(cuen).getBalance());
				    		 
				    		 }
				    	  
				    }
				    
					
					break;
				case 2 : //deposito
					System.out.println("Ingrese valor a depositar");
				    System.out.println("----------------------------------------");
				    retirar = sc.nextInt();
				    cuenta.get(cuen).setAddBalance(retirar);
		    		 System.out.println("Su nuevo saldo es: "+cuenta.get(cuen).getBalance());
		    		 
					break;
				case 3 : //transferencia
					System.out.println("Ingrese cuenta destino");
				    System.out.println("----------------------------------------");
				    destino = sc.nextInt();
				    DetinoID=validarCuenta(destino);
				    
				    if( DetinoID!=9999 ){
				    	System.out.println("Ingrese Valor a transferir");
					    System.out.println("----------------------------------------");
					    retirar = sc.nextInt();
					    valor=retirar+100;
					    cuenta.get(cuen).setBalance(valor);
					    cuenta.get(DetinoID).setAddBalance(retirar);
					    
			    		System.out.println("Su nuevo saldo es: "+cuenta.get(cuen).getBalance());
				    	
				    };
				    
					
					break;
				case 4 : 
					System.out.println("Sesion Finalizada");
					
		            break;
				}
			 
		 }while(action!= 4);
		    
	 }
	 
	 
	 public boolean validarSaldo (int cuen, int i) {
		 saldoAcutual=cuenta.get(i).getBalance();
		 if(cuen>saldoAcutual) {
			 System.out.println("Saldo insuficiente");
			 return false;
		 }
		 	return true;
		 
		 
	 }
	 
	 public int validarCuenta (int acc) {
		 for (int i = 0; i < cuenta.size(); i++) {
				acc2 = cuenta.get(i).getAccountNum();
				
				if (acc==acc2) {
				 busqueda3 = i;
				
				}	}
				
				if (busqueda3 == 9999 ) {
					System.out.println("Cuenta destino incorrecta");
					
					}
			return busqueda3;
			
		 
	 }
	 
		 
	 
	    
}
