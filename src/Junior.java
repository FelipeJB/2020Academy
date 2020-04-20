
public class Junior extends  Glober {

	public Junior(String name, int salario, String proyecto,int time) {
		super(name, salario, proyecto, time);
		System.out.println("Glober, "+name+" asignado al proyecto "+proyecto+" con salario de $"+salario+" Tiempo en Globant "+time+" años");
		
		// TODO Auto-generated constructor stub
		}
	
	
	public void cargoGlober(){
		
		  System.out.println("Cargo: Junior");
		    }
	
	public void labor(){
		  System.out.println("Labor: Desarrollar el backend de la plataforma");
		    }
}
