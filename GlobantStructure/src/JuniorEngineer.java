import java.sql.SQLOutput;

public class JuniorEngineer extends Glober {

    public JuniorEngineer(String name, String id, int salary) {
        super(name, id, salary, "Junior");
    }

    public JuniorEngineer() {
    }

    @Override
    public void functions() {
        System.out.println(" * Functions Junior * ");
        System.out.println("Developer software");
        System.out.println("Work on small bug fixes");
        System.out.println("To learn the codebase");

    }
}
