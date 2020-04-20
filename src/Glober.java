
public abstract class Glober implements Labor{

	private String name;
	private int salario;
	private String proyecto;
	private int time;
	
	public Glober(String name, int salario, String proyecto,int time) {
		// TODO Auto-generated constructor stub
			this.name=name;
			this.salario=salario;
			this.proyecto=proyecto;
			this.time=time;
	}
	
	public String getName() {
		return name;
	}
	public String getProyecto() {
		return proyecto;
	}
	public int getSalario() {
		return salario;
	}
	public int getTime() {	
		return time;
	}
	public abstract void cargoGlober();
}
