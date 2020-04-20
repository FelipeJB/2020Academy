public class ProjectManager extends Glober {

    public ProjectManager(String name, String id, int salary) {
        super(name, id, salary, "PM");
    }

    public ProjectManager() {
    }


    @Override
    public void functions() {
        System.out.println(" * Functions PM * ");
        System.out.println("Management the team");
        System.out.println("To verify that the team has the tools needed");

    }
}
