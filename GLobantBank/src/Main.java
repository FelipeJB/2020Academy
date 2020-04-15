import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int action;
		
		
		Bank banco = new Bank();
		banco.agregarCuenta();
		do {
		
		System.out.println("----------------------------------------");
        System.out.println("Pulse 1 para ingresar area Transaccional");
        System.out.println("Pulse 2 para mostrar Cuentas");
        System.out.println("Pulse 3 para salir");
		System.out.println("----------------------------------------");
        action = sc.nextInt();
		
		switch(action) {
		case 1 : 
			banco.areaTransaccional();
			break;
		case 2 : 
			banco.mostrarCuenta();
			
			break;
		
			
		case 3 : 
			
			System.out.println("Adios");
            break;
		}
		
		}while(action !=3);
		
		
	sc.close();
	

	}

}
