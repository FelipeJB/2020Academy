import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Glober glober = new SeniorEngineer("Andrés Rey", "123", 3_000_000,"QC" );
        glober.functions();
        Glober junior = new JuniorEngineer("usuario 1","123456",2_000_000);
        junior.functions();
        Glober globerS = new SeniorEngineer("QC");
        Glober pm = new ProjectManager("PM1","98765", 8_000_000);
        pm.functions();
        TechLead tl = new TechLead("Carlos", "1234", 5_000_000);
        tl.collaborators = new ArrayList<>();
        tl.collaborators.add(junior);
        tl.functions();


    }
}
