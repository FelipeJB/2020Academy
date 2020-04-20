public class SeniorEngineer extends Glober {
    public String skill;

    public SeniorEngineer(String name, String id, int salary, String skill) {
        super(name, id, salary, "Senior");
        this.skill = skill;
    }

    public SeniorEngineer(String skill) {
        this.skill = skill;
        this.rol = "Senior";
    }

    public SeniorEngineer() {
    }

    @Override
    public void functions() {
        System.out.println(" * Functions Senior * ");
        System.out.println("It is able to lead and help to resolve trouble in "+ skill);
        System.out.println("Coordinate functions to the team");

    }
}
