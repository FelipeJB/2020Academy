
public class Main {
	
	public static void main(String[] args) {

		JuniorEngineer je = new JuniorEngineer (12, "Alejandro", "Osorio", 26, 1000, "Disney", "Junior");
		SeniorEngineer se = new SeniorEngineer (123, "Maria", "Scott", 27, 2000, "InStride", "Senior");
		TechLead tl = new TechLead (1234, "Ana", "Lopez", 28, 3000, "HME", "Tech Lead");
		
		System.out.println("Globers: ");
		je.jodDescription();
		se.jodDescription();
		tl.jodDescription();
	}	
}
