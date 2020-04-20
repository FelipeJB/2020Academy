package GlobantStructure;

public class Main {
	static AdminGlober ad = new AdminGlober();
	public static void main(String[] args) {

		addGlober();
		ad.showInformation();
	}

	public static void addGlober() {
		Developer dev1 = new Developer(1111, "Laura", "Rojas", "Female", "Sr", "Discovery", 1000000, "Java");
		Developer dev2 = new Developer(1112, "Ivan", "Lemius", "Male", "Sr", "Discovery", 900000, "PHP");
		QualityControl qc1 = new QualityControl(2222, "Cesar", "Ruedas", "Male", "Sr", "Discovery", 7000000, "Manual");
		TechnicalLeader tl1 = new TechnicalLeader(3333, "Carlos", "Marin", "Male", "TL", "Titan", 11000000);
		ScrumMaster pm = new ScrumMaster(4444, "Maria", "Marulanda", "Female", "Sr", "Dicovery", 12000000);
		Champion ch = new Champion(5555, "Claudia", "Romero", "Female", "Sr", null, 8500000);		
		ad.addGlober(dev1);
		ad.addGlober(dev2);
		ad.addGlober(qc1);
		ad.addGlober(tl1);
		ad.addGlober(pm);
		ad.addGlober(ch);

	}

}
