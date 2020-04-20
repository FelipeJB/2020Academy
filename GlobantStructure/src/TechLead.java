import java.util.List;

public class TechLead extends Glober {
    public List <Glober> collaborators;

    public TechLead(String name, String id, int salary) {
        super(name, id, salary, "TL");

    }

    @Override
    public void functions() {
        System.out.println(" * Functions TL * ");
        System.out.println("To address the Team");
        System.out.println("Lead people,");
        System.out.println("Collaborators" + collaborators);
    }
}
