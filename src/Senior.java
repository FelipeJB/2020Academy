
public class Senior extends  Glober {

	public Senior(String name, int salario, String proyecto,int time) {
		super(name, salario, proyecto, time);
		System.out.println("Glober, "+name+" asignado al proyecto "+proyecto+" con salario de $"+salario+" Tiempo en Globant "+time+" años");
		
		// TODO Auto-generated constructor stub
		}
	public void cargoGlober(){
		
		  System.out.println("Cargo: Senior");
		    }
	
	public void labor(){
		  System.out.println("Labor: el QC senior coordina el equipo de qc en el proyecto");
		    }
}
