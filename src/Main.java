
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objeto TL tipo TL
		TL tl = new TL("Jhonatan",900,"ESPN",5);
		tl.cargoGlober();
		tl.labor();
		System.out.println();
		
		
		//Objeto TL de tipo Glober
		Glober tl2 = new TL("Andres",400,"Open",2);
		tl2.cargoGlober();
		tl2.labor();
		System.out.println();
		
		
		//objeto  senior tipo glober
		Glober senior = new Senior ("Sebastian",100,"JyJ",4);
		senior.cargoGlober();
		senior.labor();
		System.out.println();
		
		
		//Uso de interfaz
		Labor junior = new Junior ("Carolina",250,"HYM",8);
		junior.labor();
		
		
		
		
		
		
	}

}
