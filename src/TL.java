
public class TL extends  Glober{

	public TL(String name, int salario, String proyecto,int time) {
	super(name, salario, proyecto, time);
	System.out.println("Glober, "+name+" asignado al proyecto "+proyecto+" con salario de $"+salario+" Tiempo en Globant "+time+" años");
	
	// TODO Auto-generated constructor stub
	}

	public void cargoGlober(){
		
		  System.out.println("Cargo: Technical Lead");
		    }
	
	public void labor(){
		  System.out.println("Labor: El TL coordina la parte Tecnica del Proyecto");
		    }
}
